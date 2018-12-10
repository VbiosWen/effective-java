package com.effevtive.java.object;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:19 2018/7/10
 * @Modified By:
 */
public abstract class AbstractAnimal {

  private String name;

  private String type;

  private long id;

  public AbstractAnimal() {
  }

  public AbstractAnimal(String name, String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
