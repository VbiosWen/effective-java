package com.effevtive.java.threadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:52 2018/8/6
 * @Modified By:
 */
public class ArrayListNotSafe {

  private static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

  public static void main(String[] args) throws InterruptedException {
    testList();
  }

  private static void testList() throws InterruptedException {
    Runnable runnable = () -> {
      for (int i = 0; i < 10000; i++) {
        list.add(i);
      }
    };
    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable);
    Thread t3 = new Thread(runnable);
    t1.setName("thread-vbiso-1");
    t2.setName("thread-vbiso-2");
    t3.setName("thread-vbiso-3");
    t1.start();
    t2.start();
    t3.start();
//    t1.join();
//    t2.join();
//    t3.join();
    System.out.println(list.size());
  }

}
