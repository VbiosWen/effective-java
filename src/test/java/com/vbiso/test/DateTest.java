package com.vbiso.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import jdk.nashorn.internal.parser.DateParser;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午6:44 2018/8/28
 * @Modified By:
 */
public class DateTest {

  @Test
  public void testDateLong(){
    System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
  }

  @Test
  public void testDateParse() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-28");
    System.out.println(parse.getTime());
    Date date=new Date();
    date.setTime(1535385600000L);
    System.out.println(date);
  }

  @Test
  public void testDate(){
    long time=1536843481538L+432000L;
    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time)));
    System.out.println();
  }

}
