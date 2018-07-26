package com.vbiso.test;

import com.alibaba.fastjson.JSON;
import com.effevtive.java.builder.StreamRead;
import com.effevtive.java.builder.StreamRead.Builder;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:40 2018/7/22
 * @Modified By:
 */
public class BuilderTest {


  @Test
  public void testBuilder(){
    StreamRead streamRead = new Builder()
        .builderAge(10)
        .builderMobile("15639114941")
        .builderName("vbisowen")
        .buildPasswor("123456")
        .buildSex("man")
        .build();

    String json = JSON.toJSONString(streamRead);
    System.out.println(json);
  }

}
