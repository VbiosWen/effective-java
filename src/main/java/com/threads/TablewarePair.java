package com.threads;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 5:18 PM 2018/12/10
 * @Modified By:
 */
public class TablewarePair {

  private final TableWare leftTool;

  private final TableWare rightTool;

  public TablewarePair(TableWare leftTool, TableWare rightTool) {
    this.leftTool = leftTool;
    this.rightTool = rightTool;
  }

  public TableWare getLeftTool() {
    return leftTool;
  }

  public TableWare getRightTool() {
    return rightTool;
  }
}
