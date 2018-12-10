package com.vbiso.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:37 PM 2018/11/15
 * @Modified By:
 */
public class RegexpTest {


  @Test
  public void testRegexp(){
    String regexp="([-_.]*[A-Za-z0-9]+)*@([A-Za-z0-9]+[-.])+[A-Za-z0-9]{2,4}";
    Pattern compile = Pattern.compile(regexp);
    Matcher matcher = compile.matcher("1067477616@qq.com");
    System.out.println(matcher.matches());
  }



}
