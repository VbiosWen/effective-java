package com.vbiso.test;

import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:22 2018/7/22
 * @Modified By:
 */
public class NoCreateObject {


  @Test
  public void noCreateObject(){
    long start= Instant.now().toEpochMilli();
    Object object=null;
    boolean aNull = Objects.isNull(object);
    System.out.println(aNull);
    long sum=0l;
    for(int i=0;i<Integer.MAX_VALUE;i++){
      sum+=i;
    }
    System.out.println(sum);
    long end=Instant.now().toEpochMilli();
    System.out.println(end-start);
  }

  @Test
  public void testList(){
    WeakReference<String> test=new WeakReference<>("test");
    List<String> list=new LinkedList<>();
    WeakHashMap<String,String> weakHashMap= new WeakHashMap<>();
    Map<String, String> map = Collections.synchronizedMap(weakHashMap);
    map.put("test","test");
    list.add(test.get());
    list.forEach(System.out::println);
  }

}
