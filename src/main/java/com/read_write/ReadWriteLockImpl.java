package com.read_write;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:31 PM 2018/12/10
 * @Modified By:
 */
public class ReadWriteLockImpl implements ReadWriteLock {

  private final Object MUTEX=new Object();

  private int writingWriters=0;

  private int waitingWriters=0;

  private int readingReaders=0;

  private boolean preferWriter;

  public ReadWriteLockImpl() {
    this(true);
  }

  public ReadWriteLockImpl(boolean preferWriter) {
    this.preferWriter=preferWriter;
  }

  @Override
  public Lock readLock() {
    return new ReadLock(this);
  }

  @Override
  public Lock writeLock() {
    return new WriteLock(this);
  }

  @Override
  public int getWritingWriters() {
    return this.writingWriters;
  }

  @Override
  public int getWaitingWriters() {
    return this.waitingWriters;
  }

  @Override
  public int getReadingReaders() {
    return this.readingReaders;
  }

  public Object getMUTEX() {
    return MUTEX;
  }

  public boolean isPreferWriter() {
    return preferWriter;
  }

  public void incrementWritingWriters(){
    this.writingWriters++;
  }

  public void incrementReadingReader(){
    this.readingReaders++;
  }

  public void incrementWaitingWriters(){
    this.waitingWriters++;
  }

  public void decrementWritingWriters(){
    this.writingWriters--;
  }

  public void decrementReadingReaders(){
    this.readingReaders--;
  }

  public void decrementWaitingWriters(){
    this.waitingWriters--;
  }

  public void setPreferWriter(boolean preferWriter) {
    this.preferWriter = preferWriter;
  }
}
