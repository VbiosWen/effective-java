package com.vbiso.test;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:46 2018/9/10
 * @Modified By:
 */
public class AliCode {

    @Test
    public void testAliCode() {
        String str = "a,b,c,,";
        String[] split = str.split(",");
        System.out.println(split.length);
        Arrays.stream(split).forEach(System.out::println);
    }

    @Test
    public void testToArray() {
        String[] str=new String[]{"you","wu"};
        List list=Arrays.asList(str);
        str[0]="hah";
        System.out.println(list.get(0));

    }

}
