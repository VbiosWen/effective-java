package com.effevtive.java.utils;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:05 2018/9/12
 * @Modified By:
 */
public class HelloTest {

    public static void main(String[] args){
        TestPojo testPojo=new TestPojo();
        System.out.println(TimeUnit.HOURS.toMillis(1));
//        TestPojo testPojo1=new TestPojo();
//        for(int i=0;i<100;i++){
//            new Thread(()->testPojo.increment()).start();
//        }
//        System.out.println("thread2");
//        for(int i=0;i<100;i++){
//            new Thread(()->testPojo1.increment()).start();
//        }
    }

}
