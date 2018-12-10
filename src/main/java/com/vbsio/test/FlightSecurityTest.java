package com.vbsio.test;

import com.threads.AirPlane;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 5:01 PM 2018/12/10
 * @Modified By:
 */
public class FlightSecurityTest {

  static class Passengers extends Thread{
    private final AirPlane airPlane;

    private final String idCard;

    private final String boardingPass;

    public Passengers(AirPlane airPlane, String idCard, String boardingPass) {
      this.airPlane = airPlane;
      this.idCard = idCard;
      this.boardingPass = boardingPass;
    }

    @Override
    public void run() {
      while (true){
        airPlane.pass(boardingPass,idCard);
      }
    }
  }


  public static void main(String[] args){
    final AirPlane airPlane=new AirPlane();
    new Passengers(airPlane,"A123456","AF123456").start();
    new Passengers(airPlane,"B123456","BF123456").start();
    new Passengers(airPlane,"C123456","CF123456").start();
    new Passengers(airPlane,"D123456","DF123456").start();
  }
}
