package com.read_write;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:37 PM 2018/12/10
 * @Modified By:
 */
public class WriteLock implements Lock {

  private final ReadWriteLockImpl readWriteLock;

  WriteLock(ReadWriteLockImpl readWriteLock) {
    this.readWriteLock = readWriteLock;
  }

  @Override
  public void lock() throws InterruptedException {
    synchronized (readWriteLock.getMUTEX()) {
      try {
        readWriteLock.incrementWaitingWriters();
        while (readWriteLock.getReadingReaders() > 0 || readWriteLock.getWritingWriters() > 0) {
          readWriteLock.getMUTEX().wait();
        }
      } finally {
        this.readWriteLock.decrementWaitingWriters();
      }
      readWriteLock.incrementWritingWriters();
    }
  }

  @Override
  public void unlock() {
    synchronized (readWriteLock.getMUTEX()) {
      readWriteLock.decrementWritingWriters();
      readWriteLock.setPreferWriter(false);
      readWriteLock.getMUTEX().notifyAll();
    }
  }
}
