package com.effevtive.java.extendsExample;

import java.util.Collection;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:37 2018/7/23
 * @Modified By:
 */
public class Son extends Father {

  private int count=0;

  public Son() {
    System.out.println("son's constructor");
  }

  @Override
  public void showMessage() {
  }

  @Override
  public void add() {
    System.out.println("son's add method running");
    count++;
    super.add();
  }

  @Override
  public void addAll(Collection<Integer> c) {
    System.out.println("son's addAll method running");
    count+=c.size();
    super.addAll(c);
  }

  public int getCount() {
    return count;
  }
}


