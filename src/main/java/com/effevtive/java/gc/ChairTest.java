package com.effevtive.java.gc;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午2:31 2018/8/3
 * @Modified By:
 */
public class ChairTest {

  static boolean gcRun=false;

  static boolean f=false;

  static int created=0;

  static int finalized=0;

  int i;

  ChairTest(){
    i=++created;
    if(created==47){
      System.out.println("created 47");
      f=true;
    }
  }

  @Override
  protected void finalize() throws Throwable {
    if(!gcRun){
      gcRun=true;
      System.out.println("beginning to finalize after "+created +"chairs has been created");
    }
    if(i==47){
      System.out.println("finalize chair #47,"+"Setting flag to stop Chair creation");
      f=true;
    }
    finalized++;
    if(finalized>=created){
      System.out.println("all "+finalized+" finalized");
    }
  }
}
