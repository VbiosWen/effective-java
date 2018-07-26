package com.effevtive.java.builder;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:33 2018/7/22
 * @Modified By:
 */
public class StreamRead {

  private int age;

  private String name;

  private String password;

  private String sex;

  private String mobile;

  public static class Builder{

    private int age;

    private String name;

    private String sex;

    private String mobile;

    private String password;


    public Builder builderAge(int age){
      this.age=age;
      return this;
    }

    public Builder builderName(String name){
      this.name=name;
      return this;
    }

    public Builder buildSex(String sex){
      this.sex=sex;
      return this;
    }

    public Builder builderMobile(String mobile){
      this.mobile=mobile;
      return this;
    }

    public Builder buildPasswor(String password){
      this.password=password;
      return this;
    }

    public StreamRead build(){
      return new StreamRead(this);
    }
  }

  private StreamRead(Builder builder) {
    this.age=builder.age;
    this.mobile=builder.mobile;
    this.name=builder.name;
    this.password=builder.password;
    this.sex=builder.sex;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  public String getSex() {
    return sex;
  }

  public String getMobile() {
    return mobile;
  }
}
