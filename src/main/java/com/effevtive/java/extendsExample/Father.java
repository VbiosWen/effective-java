package com.effevtive.java.extendsExample;

import java.util.Collection;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:36 2018/7/23
 * @Modified By:
 */
public class Father {



  public Father() {
    System.out.println("father's constructor");
  }

  public void showMessage(){
    System.out.println("show father message");
  }

  public void add(){
    System.out.println("father's add method running");
  }

  public void addAll(Collection<Integer> c){
    System.out.println("father's addAll method running");
   for(Integer ce:c)
     add();
  }
}
