package com.effevtive.java.threadSafe;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:11 2018/10/16
 * @Modified By:
 */
public class IDLockClient  {

  public static void main(String[] args){
    IDLock idLock=new IDLock();
    idLock.setUserId("00001");
    IDLock idLock1=new IDLock();
    idLock1.setUserId("00001");
    IDLock idLock2=new IDLock();
    idLock2.setUserId("000002");
    for(int i=0;i<10;i++){
      new Thread(idLock,"thread-id-lock-i"+i).start();
      new Thread(idLock1,"thread-idlock-"+i).start();
      new Thread(idLock2,"thread-id-lock-2"+i).start();
    }
  }

}
