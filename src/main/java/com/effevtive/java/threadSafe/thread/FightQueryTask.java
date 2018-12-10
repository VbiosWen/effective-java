package com.effevtive.java.threadSafe.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:26 PM 2018/11/13
 * @Modified By:
 */
public class FightQueryTask extends Thread implements FightQuery{

  private final String origin;

  private final String destination;

  private final List<String> fightList=new ArrayList<>();

  public FightQueryTask(String airLine,String origin, String destination) {
    super("["+airLine+"]");
    this.origin = origin;
    this.destination = destination;
  }

  @Override
  public void run() {
    System.out.printf("%s-query from %s to %s \n",getName(),origin,destination);
    int randomVal= ThreadLocalRandom.current().nextInt(10);
    try {
      TimeUnit.SECONDS.sleep(randomVal);
      this.fightList.add(getName()+"-"+randomVal);
      System.out.printf("The fight:%s list query successful\n",getName());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<String> get() {
    return fightList;
  }
}
