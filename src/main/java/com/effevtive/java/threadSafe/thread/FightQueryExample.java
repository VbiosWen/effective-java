package com.effevtive.java.threadSafe.thread;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 10:31 PM 2018/11/13
 * @Modified By:
 */
public class FightQueryExample {

  private static List<String> fightCompany= Arrays.asList("CSA","CEA","HNA");

  public static void main(String[] args){
    List<String> search = search("SH", "BJ");
    System.out.println("========result=======");
    search.forEach(System.out::println);

  }

  private static List<String> search(String sh, String bj) {
    final List<String> result=new ArrayList<>();
    List<FightQueryTask> tasks=fightCompany.stream().map(f->createTask(f,sh,bj))
        .collect(Collectors.toList());
    tasks.forEach(Thread::start);
    tasks.forEach(t->{
      try {
        t.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    tasks.stream().map(FightQueryTask::get).forEach(result::addAll);
    return result;
  }

  private static FightQueryTask createTask(String fight,String original,String dest){
    return new FightQueryTask(fight,original,dest);
  }

}
