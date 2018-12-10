package com.effevtive.java.threadSafe.queue;

import static java.lang.Thread.currentThread;

import java.util.LinkedList;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 11:44 PM 2018/11/13
 * @Modified By:
 */
public class EventQueue {

  private final LinkedList<Event> eventQueue = new LinkedList<>();

  private static final int DEFAULT_MAX_EVENT = 10;

  private final int max;

  public EventQueue(int maxEvent) {
    this.max=maxEvent;
  }

  static class Event {

  }

  public void offer(Event event){
    synchronized (eventQueue){
      if(eventQueue.size()>=max){
        try {
          console("the queue is full");
          eventQueue.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      console("the new event is submitted");
      eventQueue.add(event);
      eventQueue.notify();
    }
  }

  public Event take(){
    synchronized (eventQueue){
      if(eventQueue.isEmpty()){
        try {
          console("the queue is empty.");
          eventQueue.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      Event event = eventQueue.removeFirst();
      this.eventQueue.notify();
      console("the event"+ event+"is handled.");
      return event;
    }
  }

  private void console(String the_queue_is_full) {
    System.out.printf("%s:%s\n",currentThread().getName(),the_queue_is_full);
  }

  public EventQueue() {
    this(DEFAULT_MAX_EVENT);
  }
}
