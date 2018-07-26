package com.effevtive.java.object;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:20 2018/7/10
 * @Modified By:
 */
public class Pig extends AbstractAnimal {

  @Override
  protected Object clone() throws CloneNotSupportedException {
   Pig pig=new Pig();
   return pig;
  }
}
