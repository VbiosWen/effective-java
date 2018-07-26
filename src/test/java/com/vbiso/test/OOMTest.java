package com.vbiso.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:54 2018/7/21
 * @Modified By:
 */
public class OOMTest {


  @Test
  public void testOOM(){
    List<Object> list=new ArrayList<>();
    while (true){
      list.add(new Object());
    }
  }

  @Test
  public void testSplit(){
    String text="123:ererr";
    String[] split = text.split(":");
    Arrays.stream(split).forEach(System.out::print);
  }


  @Test
  public void testNull(){
    try {
      List<String> list=new ArrayList<>();
      String s = list.get(0);
      System.out.println(s);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
