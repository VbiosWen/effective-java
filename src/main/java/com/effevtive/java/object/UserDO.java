package com.effevtive.java.object;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午6:03 2018/8/24
 * @Modified By:
 */
public class UserDO {

  private String name;

  private String mobile;

  private String sex;

  private String msg;

  public UserDO(String name, String mobile, String sex, String msg) {
    this.name = name;
    this.mobile = mobile;
    this.sex = sex;
    this.msg = msg;
  }

  public UserDO setName(String name) {
    this.name = name;
    return this;
  }

  public UserDO setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public UserDO setSex(String sex) {
    this.sex = sex;
    return this;
  }

  public UserDO setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public UserDO createUserDO() {
    return new UserDO(name, mobile, sex, msg);
  }
}
