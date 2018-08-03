package com.vbiso.test;

import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:44 2018/8/1
 * @Modified By:
 */

public class StaticTest {


  @Test
  public void test(){
    com.effevtive.java.object.StaticTest staticTest=new com.effevtive.java.object.StaticTest();
    com.effevtive.java.object.StaticTest.incr();
    int i = com.effevtive.java.object.StaticTest.getI();
    System.out.println(i);
  }

}
