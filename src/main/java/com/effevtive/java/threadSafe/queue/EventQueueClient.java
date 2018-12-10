package com.effevtive.java.threadSafe.queue;

import com.effevtive.java.threadSafe.queue.EventQueue.Event;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 11:52 PM 2018/11/13
 * @Modified By:
 */
public class EventQueueClient {


  public static void main(String[] args){
    final EventQueue eventQueue=new EventQueue();
    new Thread(()->{
      for(;;){
        eventQueue.offer(new Event());
      }
    },"producer").start();

    new Thread(()->{
      for(;;){
        eventQueue.take();
        try {
          TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    },"consumer").start();
  }

}
