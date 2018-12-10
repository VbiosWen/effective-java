package com.threads;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:53 2018/10/16
 * @Modified By:
 */
public class MessageThread implements Runnable {

  @Override
  public void run() {
    MessageStorageByLock messageStorageByLock=new MessageStorageByLock(1L);
    MessageStorageByLock messageStorageByLock1=new MessageStorageByLock(1L);
    messageStorageByLock.updateTotalMembers(1L,5);
    messageStorageByLock1.updateTotalMembers(1L,10);
  }
}
