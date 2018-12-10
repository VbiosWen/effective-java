package com.effevtive.java.builder;

import com.alibaba.fastjson.JSON;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:02 2018/8/24
 * @Modified By:
 */
public class EngineAlertParams {

  private Object detailObj;

  private Object resultObj;

  private String detailTitle;

  private String resultTitle;

  public static class EngineAlertParamsBuilder {

    private Object detailObj;

    private Object resultObj;

    private String detailTitle;

    private String resultTitle;

    public EngineAlertParamsBuilder detailObj(Object object) {
      this.detailObj = object;
      return this;
    }

    public EngineAlertParamsBuilder resultObj(Object message) {
      this.resultObj = message;
      return this;
    }

    public EngineAlertParamsBuilder detailTitle(String title) {
      this.detailTitle = title;
      return this;
    }

    public EngineAlertParamsBuilder resultTitle(String result) {
      this.resultTitle = result;
      return this;
    }

    public EngineAlertParams build() {
      return new EngineAlertParams(this);
    }
  }

  private EngineAlertParams(EngineAlertParamsBuilder builder) {
    this.resultTitle = builder.resultTitle;
    this.resultObj = builder.resultObj;
    this.detailTitle = builder.detailTitle;
    this.detailObj = builder.detailObj;
  }

  @Override
  public String toString() {
   StringBuilder builder=new StringBuilder();
   builder.append(detailTitle).append(JSON.toJSON(detailObj));
   return builder.toString();
  }

}
