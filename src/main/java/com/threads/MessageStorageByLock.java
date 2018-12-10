package com.threads;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:45 2018/10/16
 * @Modified By:
 */
public class MessageStorageByLock {

  private long userId;

  private int totalMembers;

  private final ReentrantLock lock;

  private static final Map<Thread,Long> syncMap=new ConcurrentHashMap<>();

  private final Condition conditionWrite;
  private boolean volidate;

  public MessageStorageByLock(long userId) {
    this.userId = userId;
    lock=new ReentrantLock(false);
    conditionWrite=lock.newCondition();
  }


  public void updateTotalMembers(long userId, int members) {
    lock.lock();
    try {
      while (isVolidate(userId)) {
        System.out.println("now userId is writing: "+userId);
        this.wait();
      }
      syncMap.put(Thread.currentThread(),userId);
      Thread.sleep(1000L);
      totalMembers += members;
      System.out.println("now total members is: " + totalMembers);
      syncMap.remove(Thread.currentThread());
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public int getTotalMembers() {
    return totalMembers;
  }

  public void setTotalMembers(int totalMembers) {
    this.totalMembers = totalMembers;
  }

  public ReentrantLock getLock() {
    return lock;
  }

  public Condition getConditionWrite() {
    return conditionWrite;
  }

  public boolean isVolidate(long userId) {
    return syncMap.containsValue(userId);
  }
}
