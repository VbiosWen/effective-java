package com.vbiso.test;

import com.effevtive.java.equals.Example;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:56 2018/7/23
 * @Modified By:
 */
public class EqualsTest {


  @Test
  public void testEquals() throws CloneNotSupportedException {
    Example example=new Example();
    example.setId("122343");
    example.setName("1312313");
    example.setPassword("23123124");
    Example clone = (Example) example.clone();
    System.out.println(clone.hashCode());
    System.out.println(example.hashCode());

  }

}
