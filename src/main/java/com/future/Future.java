package com.future;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:01 PM 2018/12/10
 * @Modified By:
 */
public interface Future <T> {

  T get() throws InterruptedException;

  boolean isDone();

  T get(long timeout);

  T get(long timeout,ErrorCallback<? super Exception> errorCallback);

}
