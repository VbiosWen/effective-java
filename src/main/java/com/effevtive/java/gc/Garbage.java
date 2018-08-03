package com.effevtive.java.gc;


/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午2:37 2018/8/3
 * @Modified By:
 */
public class Garbage {

  public static void main(String[] args){
    if(args.length==0){
      System.err.println("error");
      return;
    }
    while (!ChairTest.f){
      new ChairTest();
      new String(" To take up space");
    }
    System.out.println("After all chair has created:\n"+"total created="+ChairTest.created+",total "
        + "finalized ="+ChairTest.finalized);
    if(args[0].equals("before")){
      System.out.println("gc()");
      System.gc();
      System.out.println("run finalization");
      System.runFinalization();
    }
    System.out.println("bye");
    if(args[0].equals("after")){
      System.runFinalizersOnExit(true);
    }
  }

}
