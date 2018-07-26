package com.effevtive.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午2:52 2018/7/9
 * @Modified By:
 */
public class ServerSockets {


  public static void main(String[] args){
    try (ServerSocket socket = new ServerSocket(8189)) {
      Socket accept = socket.accept();
      InputStream inputStream = accept.getInputStream();
      OutputStream outputStream = accept.getOutputStream();
      Scanner scanner = new Scanner(inputStream);
      while (scanner.hasNext()){
        String s = scanner.nextLine();
        System.out.println(s);
      }
      PrintWriter printWriter = new PrintWriter(outputStream,true);
      printWriter.write("Hello world Enter Bye to exit");
      inputStream.close();
      outputStream.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
