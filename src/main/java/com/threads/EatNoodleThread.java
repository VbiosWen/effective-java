package com.threads;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 5:13 PM 2018/12/10
 * @Modified By:
 */
public class EatNoodleThread extends Thread {

  private final String name;

  private final TablewarePair tablewarePair;

  public EatNoodleThread(String name, TablewarePair tablewarePair) {
    this.name = name;
    this.tablewarePair = tablewarePair;
  }

  @Override
  public void run() {
    while (true) {
      this.eat();
    }
  }

  private void eat() {
    synchronized (tablewarePair) {
      System.out.println(name + " take up " + tablewarePair.getLeftTool() + "(left)");
      System.out.println(name + " take up " + tablewarePair.getRightTool() + "(right)");
      System.out.println(name + " is eating now");
      System.out.println(name + "put down " + tablewarePair.getRightTool() + "(right)");
      System.out.println(name + "put down " + tablewarePair.getLeftTool() + "(left)");
    }
  }
//dead lock
//  private void eat() {
//    synchronized (leftTool){
//      System.out.println(name + " take up "+ leftTool+"(left)");
//      synchronized (rightTool){
//        System.out.println(name + " take up "+ rightTool + "(right)");
//        System.out.println(name+" is eating now");
//        System.out.println(name + "put down "+ rightTool + "(right)");
//      }
//      System.out.println(name+ "put down "+ leftTool + "(left)");
//    }
//  }

  public static void main(String[] args) {
    TableWare fork = new TableWare("fork");
    TableWare knife = new TableWare("knife");
    new EatNoodleThread("A", new TablewarePair(fork,knife)).start();
    new EatNoodleThread("B", new TablewarePair(knife,fork)).start();
  }
}
