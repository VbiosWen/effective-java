package com.vbiso.test;

import com.effevtive.java.extendsExample.Son;
import com.effevtive.java.extendsExample.TestHashSet;
import java.util.Arrays;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:32 2018/7/23
 * @Modified By:
 */
public class ExtendsTest {


  @Test
  public void testCount(){
    TestHashSet<Integer> integers=new TestHashSet<>();
    integers.addAll(Arrays.asList(1,23,4));
    System.out.println(integers.getCount());
  }

  @Test
  public void testExtends(){
    Son father=new Son();
    father.showMessage();
    father.addAll(Arrays.asList(1,23,45));
    System.out.println(father.getCount());
  }

}
