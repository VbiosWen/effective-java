package com.effevtive.java.builder;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:39 2018/7/9
 * @Modified By:
 */
public class Client {

  public static void main(String[] args){
    NutritionsFacts facts=new NutritionsFacts.builder(1,2).password("test").startDate(1232).build();
    System.out.println(facts.getAge());

    long count=1030;
    int pageSize=50;
    double pageCount=1030/Double.valueOf(pageSize);
    int ceil = (int) Math.ceil(pageCount);
    if(false){
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }


}
