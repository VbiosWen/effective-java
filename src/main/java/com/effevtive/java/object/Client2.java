package com.effevtive.java.object;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:28 2018/7/10
 * @Modified By:
 */
public class Client2 {




  public static void main(String[] args) throws CloneNotSupportedException {
    AbstractAnimal pig=new Pig();
    pig.setId(112314L);
    pig.setName("test");
    pig.setType("hekllo");
  }

}
