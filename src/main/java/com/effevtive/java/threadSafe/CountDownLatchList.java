package com.effevtive.java.threadSafe;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:29 2018/10/16
 * @Modified By:
 */
public class CountDownLatchList implements Runnable {


  private CountDownLatch latch;

  public CountDownLatchList(CountDownLatch latch) {
    this.latch=latch;
  }

  @Override
  public void run() {

    System.out.println("当前执行子线程");
    try {
      Thread.sleep(5000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    latch.countDown();
  }
}
