package com.future;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:02 PM 2018/12/10
 * @Modified By:
 */
public interface FutureService<IN,OUT> {

  Future<?> submit(Runnable runnable);

  Future<OUT> submit(Task<IN,OUT> task,IN input);

  Future<OUT> submit(Task<IN,OUT> task,IN input,Callback<OUT> callback);

  static <T,R> FutureService<T,R> newService(){
    return new FutureServiceImpl<>();
  }

}
