package com.effevtive.java.object;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午2:41 2018/8/20
 * @Modified By:
 */
public class TestDO {


  private int id;

  private String name;

  public TestDO() {
  }

  public TestDO(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
