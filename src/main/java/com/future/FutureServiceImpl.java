package com.future;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:05 PM 2018/12/10
 * @Modified By:
 */
public class FutureServiceImpl<IN, OUT> implements FutureService<IN, OUT> {

  private final static String FUTURE_THREAD_PREFIX = "FUTURE_";

  private final AtomicInteger nextCounter = new AtomicInteger(0);

  private String getNextName() {
    return FUTURE_THREAD_PREFIX + nextCounter.incrementAndGet();
  }

  @Override
  public Future<?> submit(Runnable runnable) {
    final FutureTask<Void> future = new FutureTask<>();
    new Thread(() -> {
      runnable.run();
      future.finish(null);
    }, getNextName()).start();
    return future;
  }

  @Override
  public Future<OUT> submit(Task<IN, OUT> task, IN input) {
    final FutureTask<OUT> future = new FutureTask<>();
    new Thread(() -> {
      OUT result = task.get(input);
      future.finish(result);
    }, getNextName()).start();
    return future;
  }

  @Override
  public Future<OUT> submit(Task<IN, OUT> task, IN input, Callback<OUT> callback) {
    final FutureTask<OUT> futureTask = new FutureTask<>();
    new Thread(() -> {
      OUT out = task.get(input);
      futureTask.finish(out);
      callback.call(out);
    }, getNextName()).start();
    return futureTask;
  }
}
