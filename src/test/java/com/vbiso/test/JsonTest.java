package com.vbiso.test;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:29 2018/7/26
 * @Modified By:
 */
public class JsonTest {


  @Test
  public void test(){
    Map<String,String> map=new HashMap<>();
    map.put("expireDay1","1:hi! i'm vbiso");
    map.put("expireDay2","2:hi! i'm test");
    map.put("expireDay3","3:hi! i'm hello");
    map.put("expireDay4","4:hi! i'm world");
    map.put("expireDay5","5:hi! i'm haha");
    map.put("expireDay6","6:hi! i'm goodJob");
    String s = JSONObject.toJSONString(map);
    System.out.println(s);
  }

}
