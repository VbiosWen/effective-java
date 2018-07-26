package com.effevtive.java.object;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: wenliujie
 * @Description:
 *No.1 创建和销毁对象
 * 静态工厂方法(非设计模式的静态工厂方法)
 *创建对象时如果初始化一个对象，就保证了每次getSingleton的时候都是返回的同一个对象，在spring中用途广泛
 * 单例模式又分为饥汉模式和懒汉模式
 * 饥汉模式因为在类被类加载器时就应经初始化了，所以不会有线程安全问题，但是懒汉模式因为是在调用时才会生成，所以有线程安全问题
 *
 *
 * @Date: Created in 下午8:10 2018/7/4
 * @Modified By:
 */
public class ConstructorMultiParameter implements Serializable {


  private static final long serialVersionUID = 8154390482647804873L;
  private volatile static transient ConstructorMultiParameter constructorMultiParameter=new ConstructorMultiParameter();

  private static transient ConstructorMultiParameter constructorMultiParameter1=null;

  private transient String _id;

  private transient String userName;

  private transient Double test;

  public Double getTest() {
    return test;
  }

  public void setTest(Double test) {
    this.test = test;
  }

  private static ReentrantLock lock= new ReentrantLock();
  /**
   * 在单例模式下，必须将构造方法设为私有，防止通过构造方法直接创建对象
   */
  private ConstructorMultiParameter() {
    if(constructorMultiParameter1!=null){
      //防止通过反射创建对象
      throw new RuntimeException();
    }
  }

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @org.jetbrains.annotations.NotNull
  public static ConstructorMultiParameter getSingleton(){
    return constructorMultiParameter;
  }

  public static ConstructorMultiParameter getInstance(){
    try {
      if(constructorMultiParameter1!=null){
      }else{
        Thread.sleep(3000);
        try {
          lock.lock();
          if(constructorMultiParameter1==null) {
            constructorMultiParameter1 = new ConstructorMultiParameter();
          }
        }catch (RuntimeException ex){
          throw new RuntimeException();
        }finally {
          lock.unlock();
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return constructorMultiParameter1;
  }

  private Object readResolve(){
    return constructorMultiParameter;
  }

  public static void main(String[] args){
//    for(int i=0;i<10;i++){
//      new Thread(()-> System.out.println(ConstructorMultiParameter.getInstance().hashCode())).start();
//    }
    System.out.println(1L<<53L);
    Long along=null;
    System.out.println(along==null);
  }

}
