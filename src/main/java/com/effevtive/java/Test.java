package com.effevtive.java;

import com.effevtive.java.applet.TestProtect;
import com.effevtive.java.object.ConstructorMultiParameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:09 2018/7/4
 * @Modified By:
 */
public class Test {

  private int a;

  private double b;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  private static Logger logger= LoggerFactory.getLogger(Test.class);

  public static void main(String[] args){

    Test test=new Test();
    System.out.println(test.getA()+","+ test.getB());

    Double db = ConstructorMultiParameter.getSingleton().getTest();
    //Integer test=0;
    Integer test1=0;
    int a =0;
    Integer b=0;
    System.out.println(true);
    System.out.println(test1.equals(test));
    List<Integer> list=new ArrayList<>();
    list.add(1);
    List list11=null;
    List list1=new ArrayList();
    System.out.println(CollectionUtils.isEmpty(null));
    System.out.println(CollectionUtils.sizeIsEmpty(null));

    TestProtect testProtect=new TestProtect();

  }

}
