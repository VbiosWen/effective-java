package com.read_write;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:33 PM 2018/12/10
 * @Modified By:
 */
public class ReadLock implements Lock {

  private final ReadWriteLockImpl readWriteLock;

  ReadLock(ReadWriteLockImpl readWriteLock) {
    this.readWriteLock = readWriteLock;
  }

  @Override
  public void lock() throws InterruptedException {
    synchronized (readWriteLock.getMUTEX()) {
      while (readWriteLock.getWritingWriters() > 0
          || (readWriteLock.isPreferWriter() && readWriteLock.getWaitingWriters() > 0)) {
        readWriteLock.getMUTEX().wait();
      }
      readWriteLock.incrementReadingReader();
    }
  }

  @Override
  public void unlock() {
    synchronized (readWriteLock.getMUTEX()) {
      readWriteLock.decrementReadingReaders();
      //readWriteLock.incrementWaitingWriters();
      readWriteLock.setPreferWriter(true);
      readWriteLock.getMUTEX().notifyAll();
    }
  }
}
