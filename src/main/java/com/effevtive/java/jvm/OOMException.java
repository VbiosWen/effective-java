package com.effevtive.java.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:56 2018/7/26
 * @Modified By:
 */
public class OOMException {

   static class OOMObject{

  }

  public static void main(String[] args){
    List<OOMObject> list=new ArrayList<>();
    while (true){
      list.add(new OOMObject());
    }
  }

}
