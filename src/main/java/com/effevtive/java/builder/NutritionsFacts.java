package com.effevtive.java.builder;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:31 2018/7/9
 * @Modified By:
 */
public class NutritionsFacts {

  private final int name;

  private final int age;

  private final int startDate;

  private final String password;


  public NutritionsFacts(int name, int age, int startDate, String password) {
    this.name = name;
    this.age = age;
    this.startDate = startDate;
    this.password = password;
  }

  public static class builder{
    private final int name;

    private final int age;

    private int startDate=0;

    private String password="123456";

    public builder(int name, int age) {
      this.name = name;
      this.age = age;
    }

    public builder startDate(int val){
      startDate=val;
      return this;
    }

    public builder password(String arg){
      this.password=arg;
      return this;
    }

    public NutritionsFacts build(){
      return new NutritionsFacts(this);
    }

  }

  private NutritionsFacts(builder builder) {
    age=builder.age;
    name=builder.name;
    startDate=builder.startDate;
    password=builder.password;

  }

  public int getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getStartDate() {
    return startDate;
  }

  public String getPassword() {
    return password;
  }
}
