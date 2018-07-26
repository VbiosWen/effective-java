package com.effevtive.java.seri;

import com.alibaba.fastjson.JSON;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:57 2018/7/9
 * @Modified By:
 */
public class Seriliable {

  private static Instance instance;

  public static void main(String[] args){
    try {
      ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/main/instance.obj"));
//      UserDo instance=UserDo.getInstance();
//      instance.set_id(122314L);
//      oos.writeObject(instance);
      instance = Instance.INStANCE;
      instance.set_id(14214L);
      instance.setName("test");
      instance.setPassword("134424");
      instance.setSex(1);
      oos.writeObject(instance);
      oos.close();
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/main/instance.obj"));
//      UserDo object = (UserDo) ois.readObject();
//      System.out.println(instance.hashCode());
//      System.out.println(object.hashCode());
//      System.out.println(object.get_id());
//      System.out.println(instance.get_id());

      Instance instance1 = (Instance) ois.readObject();
      System.out.println(instance.hashCode());
      System.out.println(instance1.hashCode());
      System.out.println(JSON.toJSONString(instance.get_id()));
      System.out.println(JSON.toJSONString(instance1.get_id()));
      ois.close();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
