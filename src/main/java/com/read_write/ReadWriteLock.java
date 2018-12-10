package com.read_write;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:29 PM 2018/12/10
 * @Modified By:
 */
public interface ReadWriteLock {

  //创建reader锁
  Lock readLock();

  Lock writeLock();

  int getWritingWriters();

  int getWaitingWriters();

  int getReadingReaders();

  static ReadWriteLock readWriteLock(){
    return new ReadWriteLockImpl();
  }

  static ReadWriteLock readWriteLock(boolean preferWriter){
    return new ReadWriteLockImpl(preferWriter);
  }


}
