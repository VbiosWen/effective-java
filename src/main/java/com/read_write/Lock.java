package com.read_write;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:29 PM 2018/12/10
 * @Modified By:
 */
public interface Lock {


  void lock() throws InterruptedException;

  void unlock();
}
