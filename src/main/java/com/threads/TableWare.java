package com.threads;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 5:12 PM 2018/12/10
 * @Modified By:
 */
public class TableWare {

  private final String toolName;

  public TableWare(String toolName) {
    this.toolName = toolName;
  }

  @Override
  public String toString() {
    return "TableWare{" +
        "toolName='" + toolName + '\'' +
        '}';
  }
}
