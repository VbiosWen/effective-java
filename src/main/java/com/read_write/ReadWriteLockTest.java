package com.read_write;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:52 PM 2018/12/10
 * @Modified By:
 */
public class ReadWriteLockTest {

  private final static String text="Thisistheexampleforredawritelock";

  public static void main(String[] args){
    final ShareData shareData=new ShareData(50);
    for(int i=0;i<1;i++){
      new Thread(()->{
        for(int index=0;index<text.length();index++){
          try {
            char c=text.charAt(index);
            shareData.write(c);
            System.out.println(Thread.currentThread()+" write "+ c);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }).start();
    }
    for(int i=0;i<10;i++){
      new Thread(()->{
        while (true){
          try {
            System.out.println(Thread.currentThread()+" read "+new String(shareData.read()));
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }).start();
    }
  }

}
