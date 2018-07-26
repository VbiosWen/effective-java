package com.effevtive.java.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:20 2018/7/10
 * @Modified By:
 */
public class Client {


  public static void main(String[] args){

    AbstractAnimal animal=new Pig();
    animal.setId(12323L);
    animal.setName("hello");
    animal.setType("pig");
    AbstractAnimal animal1=new Monkey();
    animal1.setType("monkey");
    animal1.setName("world");
    animal1.setId(344332L);
    List<AbstractAnimal> list=new ArrayList<>();
    list.add(animal);
    list.add(animal1);
    AbstractAnimal animal2 = list.get(1);
    if(animal2 instanceof Monkey){
      Monkey monkey= (Monkey) animal2;
      System.out.println(monkey.getType());
    }else if(animal2 instanceof Pig){
      Pig pig= (Pig) animal2;
      System.out.println(pig.getType());
    }
    //System.out.println(list.get(0).getId());

  }

}
