package com.vbiso.test;

import com.sun.tools.corba.se.idl.StringGen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午4:20 2018/8/3
 * @Modified By:
 */
public class HelloClassify {


  public String classfy(Set<?> s){
    return "set";
  }

  public String classfy(List<?> list){
    return "list";
  }

  public String classfy(Collection<String> collection){
    return "unknown Collection";
  }

  @Test
  public void test(){
    Collection<?>[] collection={new HashSet<String>(),new ArrayList<String>(),new HashMap<String,String>().values()};
    Arrays.stream(collection).forEach((Collection c)-> System.out.println(classfy(c)));

    List<Integer> list=new ArrayList<>();
    for(int i=0;i<100;i++){
      list.add(i);
    }
    list.stream()
    .filter((intg)->intg%2==0)
    .forEach(System.out::print);
  }

  @Test
  public void testArray(){
    int[] digist={1,23,4535,25,235,2525,2156,512,515};
    System.out.println(Arrays.toString(digist));
  }


}
