package com.effevtive.java.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 上午10:06 2018/9/14
 * @Modified By:
 */
public class Server {


    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(80);
        Socket socketAccept = socket.accept();

        InputStream is = socketAccept.getInputStream();
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br=new BufferedReader(reader);
        String info=null;
        do {
            info=br.readLine();
            System.out.println(info);
        }while (info!=null);
    }

}
