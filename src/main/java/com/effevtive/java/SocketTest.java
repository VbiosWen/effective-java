package com.effevtive.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午2:32 2018/7/9
 * @Modified By:
 */
public class SocketTest {

  public static void main(String[] args){
    try (Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13)) {
      socket.setSoTimeout(1000);
      InputStream input = socket.getInputStream();
      Scanner scanner = new Scanner(input);
      while (scanner.hasNext()){
        String s = scanner.nextLine();
        System.out.println(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
