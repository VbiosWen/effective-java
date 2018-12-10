package com.future;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:06 PM 2018/12/10
 * @Modified By:
 */
public class FutureTask<T> implements Future<T> {

  private T result;

  private boolean isDone=false;

  private final Object LOCK=new Object();

  @Override
  public T get() throws InterruptedException {
    synchronized (LOCK){
      while (!isDone){
        LOCK.wait();
      }
      return result;
    }
  }

  protected void finish(T result){
    synchronized (LOCK){
      if(isDone)
        return;
      this.result=result;
      this.isDone=true;
      LOCK.notifyAll();
    }
  }

  @Override
  public boolean isDone() {
    return isDone;
  }

  @Override
  public T get(long timeout) {
    synchronized (LOCK){
      while (!isDone){
        try {
          wait(timeout);
        } catch (InterruptedException e) {
          return null;
        }
      }
      return result;
    }
  }

  @Override
  public T get(long timeout, ErrorCallback<? super Exception> errorCallback) {
    synchronized (LOCK){
      while (!isDone){
        try {
          wait(timeout);
        } catch (InterruptedException e) {
          errorCallback.errorCallback(e);
          return null;
        }
      }
      return result;
    }
  }
}
