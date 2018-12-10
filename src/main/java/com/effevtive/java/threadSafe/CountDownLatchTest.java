package com.effevtive.java.threadSafe;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:31 2018/10/16
 * @Modified By:
 */
public class CountDownLatchTest {

  private static CountDownLatch latch=new CountDownLatch(1);

  public static void main(String[] args){
    CountDownLatchList list=new CountDownLatchList(latch);
    new Thread(list,"count-down-latch-list-001").start();
    try {
      latch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("执行父线程....");
  }

}
