package com.effevtive.java.utils;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:18 2018/8/6
 * @Modified By:
 */
public class StringUtils {

  public static String process(String text){
    if(text.indexOf("【") < 0) {
      return text;
    }
    if (text.startsWith("【")) { //已经前置的
      int idx = text.indexOf("】");
      String sign = text.substring(0, idx + 1);
      String context = text.substring(idx + 1).replace("【", " ").replace("】", " ");
      return sign + context;
    } else {
      int lastIdx = text.lastIndexOf("【");
      String sign = text.substring(lastIdx);
      String context = text.substring(0, lastIdx).replace("【", " ").replace("】", " ");
      return sign + context;
    }
  }

  public static void main(String[] args){

    String text="尊敬的顾客，感谢您購买本店宝贝，现在写30-50字好评评价+5张晒图，截图给客服，可获得10元现金紅包！回T退订【YONEX葱林专卖店】";
    String process = process(text);
    System.out.println(process);

    long Id=Long.MAX_VALUE;
    String id="sfdffasffdfa";
    String ddf=Id+id;
    System.out.println(ddf);
  }


  public String testTemplate(){
    return null;
  }

}
