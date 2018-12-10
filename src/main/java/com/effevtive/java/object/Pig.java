package com.effevtive.java.object;

import com.alibaba.fastjson.JSON;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:20 2018/7/10
 * @Modified By:
 */
public class Pig extends AbstractAnimal {


  public Pig() {
  }

  public Pig(String name, String sex) {
    super(name,sex);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
   Pig pig=new Pig();
   return pig;
  }

  public static void main(String[] args){
    Pig pig = new Pig("test", "test");
    System.out.println(JSON.toJSONString(pig));
  }

}
