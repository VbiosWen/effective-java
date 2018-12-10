package com.threads;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午6:41 2018/10/16
 * @Modified By:
 */
public class LockClient {

  public static void main(String[] args){
    for (int i=0;i<10;i++){
      new Thread(new MessageThread(),"thread-rest:"+i).start();
    }
  }

}
