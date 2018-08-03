package com.vbiso.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午11:10 2018/7/11
 * @Modified By:
 */
public class SwitchTest {

  @Test
  public void testSwitch(){

    int a=1;

    switch (a){
      case 0:{
        System.out.println(true);
        break;
      }
      case 1:{
        if(!true){
          return;
        }else{
          System.out.println(false);
        }
        break;
      }
      default:{
        System.out.println(String.valueOf("null"));
        break;
      }
    }
    System.out.println(false);


  }



  @Test
  public void testExpire(){
    System.out.println("");

    Long time=100L;

    double pageNod=time/3.0;

    System.out.println(pageNod);
  }


  @Test
  public void testJAVA(){
    List<String> list=new ArrayList<>();
    Function function= o -> {
      List<String> list1= (List) o;
      list1.add("teest");
      return list1;
    };
    @SuppressWarnings("unchecked")
    List<String> apply = (List<String>) function.apply(list);
    apply.forEach(System.out::println);
    String a="13434";
    Integer b=applyMethod(a, Integer::parseInt);
    System.out.println(a instanceof String);
    System.out.println(b instanceof Integer);

  }


  public static int applyMethod(String number,Function<String,Integer> function){
    return function.apply(number);
  }

}
