package com.effevtive.java.seri;

import java.io.ObjectInputStream;
import java.io.Serializable;
import org.jetbrains.annotations.Contract;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:56 2018/7/9
 * @Modified By:
 */
public class UserDo implements Serializable {

  private static final long serialVersionUID = 284082384129832450L;

  private String name;

  private long _id;

  private String password;

  private int sex;

  public static final UserDo user=new UserDo();

  public static UserDo getInstance(){
    return user;
  }


  private UserDo() {
  }

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

  @Contract(pure = true)
  private Object readResolve(){
    return user;
  }


}
