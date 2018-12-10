package com.future;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:15 PM 2018/12/10
 * @Modified By:
 */
public class FutureClientTest {


  public static void main(String[] args) throws InterruptedException {
    FutureService<Void,Void> service=FutureService.newService();
    Future<?> future = service.submit(() -> {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("I am finish done.");
    });
    Object o = future.get();

    FutureService<String,Integer> service1=FutureService.newService();
    Future<Integer> hello = service1.submit(input -> {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return input.length();
    }, "hello");
    System.out.println(hello.get());
    FutureService<String,Integer> service2=FutureService.newService();
    Future<Integer> taks=service2.submit(input -> {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return input.length();
    },"hello",System.out::println);
    System.out.println(taks.get());

    FutureService<String,Integer> service3=FutureService.newService();
    Future<Integer> hello1 = service3.submit(input -> {
      try {
        TimeUnit.SECONDS.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return input.length();
    }, "hello");
    hello1.get(5,e -> System.out.println(e.getMessage()));
  }

}
