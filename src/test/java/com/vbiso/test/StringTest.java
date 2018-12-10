package com.vbiso.test;

import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午6:15 2018/10/16
 * @Modified By:
 */
public class StringTest {

  @Test
  public void TestString(){
    Mergo mergo=new Mergo();
    StringBuilder builder=new StringBuilder();
    builder.append(mergo.getTest());
    System.out.println(builder);
  }

}
