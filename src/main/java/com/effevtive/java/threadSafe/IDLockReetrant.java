package com.effevtive.java.threadSafe;

import java.time.Instant;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:36 2018/10/16
 * @Modified By:
 */
public class IDLockReetrant implements Runnable {

  private String userId;

  //非公平锁
  private final ReentrantLock lock=new ReentrantLock(false);

  private final Condition conditionWrite=lock.newCondition();


  @Override
  public void run() {
    lock.lock();
    try {
      Instant start= Instant.now();
      Thread.sleep(1000L);
      Instant end = Instant.now();
      System.out.println("thread start in userId:"+userId+",cost time:"+(end.toEpochMilli()-start.toEpochMilli()));
      conditionWrite.await();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }

  }
}
