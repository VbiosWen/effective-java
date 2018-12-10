package com.future;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:53 PM 2018/12/10
 * @Modified By:
 */
@FunctionalInterface
public interface ErrorCallback<T extends Exception> {

  void errorCallback(T t);
}
