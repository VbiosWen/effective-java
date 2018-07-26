package com.effevtive.java;

import java.util.Arrays;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午10:16 2018/7/18
 * @Modified By:
 */
public class MergeSort {


  public static void sort(Integer[] array, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;
      sort(array, left, mid);
      sort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }

  private static void merge(Integer[] array, int left, int mid, int right) {
    Integer[] temp = new Integer[right - left + 1];
    int i = left;
    int j = mid + 1;
    int k = 0;
    //比较过程
    while (i <= mid && j <= right) {
      if (array[i].compareTo(array[j]) <= 0) {
        temp[k] = array[i];
        i++;
      } else {
        temp[k] = array[j];
        j++;
      }
      k++;
    }
    //如果是左边的大，将左边的数据保存在右边
    while (i <= mid) {
      temp[k] = array[i];
      i++;
      k++;
    }
    //如果是右边的大，将右边的数据保存在右边
    while (j <= right) {
      temp[k] = array[j];
      j++;
      k++;
    }
    //位置调换
    System.arraycopy(temp, 0, array, 0 + left, temp.length);
  }

  public static void main(String[] args) {
    int mid= 0;
    System.out.println(mid);
    Integer[] array = {1, 3, 4, 5, 6, 23, 231, 21, 2, 3, 4, 51, 53};
    sort(array, 0, array.length - 1);
    Arrays.stream(array).forEach(System.out::println);
  }

}
