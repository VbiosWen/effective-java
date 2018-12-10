package com.effevtive.java.utils;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午5:05 2018/9/12
 * @Modified By:
 */
public class TestPojo {


    private int anInt=0;

    public void increment(){
        this.anInt++;
        System.out.println(anInt);
    }

    public int getAnInt() {
        return anInt;
    }
}
