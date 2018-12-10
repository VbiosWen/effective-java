package com.vbiso.test;

import com.alibaba.fastjson.JSON;
import com.effevtive.java.builder.EngineAlertParams;
import com.effevtive.java.builder.EngineAlertParams.EngineAlertParamsBuilder;
import com.effevtive.java.builder.StreamRead;
import com.effevtive.java.builder.StreamRead.Builder;
import com.effevtive.java.object.Pig;
import com.effevtive.java.object.TestDO;
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

  @Test
  public void testBUilderParma(){
    EngineAlertParams build = new EngineAlertParamsBuilder()
        .detailObj(new TestDO(1,"rerre"))
        .detailTitle("test")
        .build();
    System.out.println(build.toString());
  }

}
