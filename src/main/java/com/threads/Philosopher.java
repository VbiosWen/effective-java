package com.threads;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 5:50 PM 2018/12/10
 * @Modified By:
 */
public class Philosopher extends Thread {


  private final String name;

  private final Fork fork;

  public Philosopher(@NotNull String name,
      Fork fork) {
    super(name);
    this.name = name;
    this.fork = fork;
  }

  @Override
  public void run() {
    while (true){
      thinking();
      eating();
    }
  }

  private void eating() {
    System.out.println("I am eating:" + name);
    fork.takeFork();
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    fork.putFork();
  }

  private void thinking() {
    System.out.println("I am thinking:" + name);
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args){
    Fork fork=new Fork();
    new Philosopher("0",fork).start();
    new Philosopher("1",fork).start();
    new Philosopher("2",fork).start();
    new Philosopher("3",fork).start();
    new Philosopher("4",fork).start();
  }
}
