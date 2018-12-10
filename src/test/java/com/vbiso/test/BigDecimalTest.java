package com.vbiso.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:26 2018/8/28
 * @Modified By:
 */
public class BigDecimalTest {

  @Test
  public void testBigDecimalDevide(){
    BigDecimal bigDecimal = new BigDecimal(555);
    BigDecimal bigDecimal1 = new BigDecimal(1111);
    BigDecimal divide = bigDecimal.divide(bigDecimal1, 2, RoundingMode.HALF_UP);
    System.out.println(divide.toPlainString());
    System.out.println(divide.toString());
  }

  @Test
  public void testMoveLong(){
    long l=1L<<20L;
    System.out.println(l);
  }

}
