package com.effevtive.java.jvm;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:33 2018/7/26
 * @Modified By:
 */
public class JavaVmStackSOF {

  private int stackLength=1;

  public void stackLeak(){
    stackLength++;
    stackLeak();
  }

  public static void main(String[] args){
    JavaVmStackSOF sof=new JavaVmStackSOF();
    try {
      sof.stackLeak();
    }catch (Throwable th){
      System.out.println("stack length:"+sof.stackLength);
      throw th;
    }
  }

}
