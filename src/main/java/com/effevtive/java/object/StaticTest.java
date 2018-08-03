package com.effevtive.java.object;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:39 2018/8/1
 * @Modified By:
 */
public class StaticTest {

  public static int i=46;

  public static void incr(){
    StaticTest.i++;
  }


  public static int getI() {
    return i;
  }

  public static void setI(int i) {
    StaticTest.i = i;
  }

  public static void main(String[] args){
  }

}
