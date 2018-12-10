package com.future;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 8:03 PM 2018/12/10
 * @Modified By:
 */
@FunctionalInterface
public interface Task<IN,OUT> {

  OUT get(IN input);

}
