package com.dason.jdk8.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author chendecheng
 * @since 2020-06-10 22:33
 */
public class comparatorDemo1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");

        //默认的排序方式
        Collections.sort(list);

        //指定排序比较器的方式---start----
        //通过字符串长度，通过lambda表达式的方式
        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
        //通过方法引用的方式
        Collections.sort(list, Comparator.comparingInt(String::length).reversed());


        //一个疑问，为什么这里方法引用的方式可以这样通过比较器排序呢？因为方法引用也等于指定比较对象的类型是String类型，
        // 但是用lambda表达式的方式是无法识别比较对象是字符串类型的为什么呢？
        //--回答:如果是list.stream()....这种开始的就能够知道是什么类型的，但是我们入参的list跟比较器的类型没有直接的对应关系，
        //比较器无法正确识别比较器的类型，我们进入代码发现comparingInt这个方法的入参的比较器的类型是当前类型或者父类类型，所以在这里是字符串或者
        //字符串的父类，但是不能确定，所以就默认是Object类型了
//        Collections.sort(list, Comparator.comparingInt(item -> item.length()).reversed()); 这样报错，对象item无法识别为字符串
        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());



        //指定排序比较器的方式---end----

    }

}
