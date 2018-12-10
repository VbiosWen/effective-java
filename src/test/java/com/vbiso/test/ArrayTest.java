package com.vbiso.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:28 2018/8/3
 * @Modified By:
 */
public class ArrayTest {


  enum Face{
    ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT
  }

  @Test
  public void testArray(){
    List<Face> faces = Arrays.asList(Face.values());
    for(Iterator<Face> i=faces.iterator();i.hasNext();){
      Face next = i.next();
      for(Iterator<Face> j=faces.iterator();j.hasNext();){
        System.out.println(next+"\t"+j.next());
      }
    }
  }

  @Test
  public void testList(){
    List list=new ArrayList();
    System.out.println(CollectionUtils.sizeIsEmpty(list));
    Integer i=129;
    Integer b=129;
    System.out.println(i==b);
  }

  @Test
  public void testLIst(){
    long now=System.currentTimeMillis();
    if(now+ TimeUnit.MINUTES.toMillis(10)<System.currentTimeMillis()){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
    System.out.println(new Date(1536562730000L));
  }



}
