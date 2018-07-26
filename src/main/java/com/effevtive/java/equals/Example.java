package com.effevtive.java.equals;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午8:53 2018/7/23
 * @Modified By:
 */
public class Example implements Cloneable {


  private String id;

  private String name;

  private String password;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Example example = (Example) o;

    return new EqualsBuilder()
        .append(id, example.id)
        .append(name, example.name)
        .append(password, example.password)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
