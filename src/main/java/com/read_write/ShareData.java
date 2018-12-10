package com.read_write;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:46 PM 2018/12/10
 * @Modified By:
 */
public class ShareData {

  private final List<Character> container=new ArrayList<>();

  private final ReadWriteLock readWriteLock=ReadWriteLock.readWriteLock(true);

  private final Lock readLock=readWriteLock.readLock();

  private final Lock writeLock=readWriteLock.writeLock();

  private final int length;

  public ShareData(int length) {
    this.length = length;
    for(int i=0;i<length;i++){
      container.add(i,'c');
    }
  }

  public char[] read() throws InterruptedException{
    try {
      readLock.lock();
      char[] newBuffer=new char[length];
      for(int i=0;i<length;i++){
        newBuffer[i]=container.get(i);
      }
      slowly();
      return newBuffer;
    }finally {
      readLock.unlock();
    }
  }

  public void write(char c) throws InterruptedException{
    try {
      writeLock.lock();
      for(int i=0;i<length;i++){
        this.container.add(i,c);
      }
      slowly();
    }finally {
      writeLock.unlock();
    }
  }

  private void slowly() {
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}