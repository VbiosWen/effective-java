package com.future;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:38 PM 2018/12/10
 * @Modified By:
 */
@FunctionalInterface
public interface Callback<T> {

  void call(T t);

}
