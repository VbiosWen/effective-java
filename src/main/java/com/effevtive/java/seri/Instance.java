package com.effevtive.java.seri;

/**
 * @Author: wenliujie
 * @Description: 枚举方式创建单例，根据我的经验来看在web领域不太现实，因为其无法序列化为一个json数据，同时实体类方面还是用class的多一些，
 * 枚举类想担当class的任务，还有非常大的局限性
 * @Date: Created in 下午4:05 2018/7/9
 * @Modified By:
 */
public enum Instance {
  INStANCE;


  private String name;

  private long _id;

  private String password;

  private int sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long get_id() {
    return _id;
  }

  public void set_id(long _id) {
    this._id = _id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }
}
