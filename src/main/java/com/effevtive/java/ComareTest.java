package com.effevtive.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:56 2018/7/6
 * @Modified By:
 */
public class ComareTest {


  private List<Integer> time;

  /**
   *  比较大小类
   * @param o1
   * @param o2
   * @return
   */
  public static int compare(ComareTest o1,ComareTest o2){
    return o1.getTime().size()>o2.getTime().size()?1:-1;
  }


  public List<Integer> getTime() {
    return time;
  }

  public void setTime(List<Integer> time) {
    this.time = time;
  }

  public static void main(String [] args){
    ComareTest comareTest = new ComareTest();
    comareTest.setTime(Arrays.asList(1,2,3,4,5));
    List list=new ArrayList();
    list.add(comareTest);
    ComareTest comareTest2=new ComareTest();
    comareTest2.setTime(Arrays.asList(1,2,3));
    list.add(comareTest2);
    list.sort((Comparator<ComareTest>) (o1, o2) -> compare(o1, o2));
    System.out.println(Arrays.toString(list.toArray()));
  }
}
