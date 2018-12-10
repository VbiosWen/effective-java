package com.effevtive.java.threadSafe;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:11 2018/10/16
 * @Modified By:
 */

public class IDLock  implements Runnable{



  private String userId;



  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public void run() {
    synchronized (userId){
      long start= Instant.now().toEpochMilli();
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      long end=Instant.now().toEpochMilli();
      System.out.println("userID is run: "+this.hashCode()+" cost times:"+(end-start)+" userID:"+userId);
    }
  }
}
