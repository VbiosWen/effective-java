package com.effevtive.java.extendsExample;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午9:29 2018/7/23
 * @Modified By:
 */
public class TestHashSet<E> extends HashSet<E> {

  private int count=0;

  /**
   * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has default initial capacity
   * (16) and load factor (0.75).
   */
  public TestHashSet(){
  }

  public TestHashSet(int initcap,float loadFactor){
    super(initcap,loadFactor);
  }

  @Override
  public boolean add(E e) {
    count++;
    return super.add(e);
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    count+=c.size();
    return super.addAll(c);
  }

  public int getCount() {
    return count;
  }
}
