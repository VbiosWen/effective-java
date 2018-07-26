package com.vbiso.test;

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

}
