package com.threads;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 4:58 PM 2018/12/10
 * @Modified By:
 */
public class AirPlane {

  private int count =0;

  private String boardingPass="null";

  private String idCard="null";

  public synchronized void pass(String boardingPass,String idCard){
    this.boardingPass=boardingPass;
    this.idCard=idCard;
    this.count++;
    check();
  }

  private void check() {
    if(boardingPass.charAt(0)!=idCard.charAt(0)){
      throw new RuntimeException("======Exception====="+toString());
    }else{
      System.out.println(toString());
    }
  }

  @Override
  public String toString() {
    return "AirPlane{" +
        "count=" + count +
        ", boardingPass='" + boardingPass + '\'' +
        ", idCard='" + idCard + '\'' +
        '}';
  }
}
