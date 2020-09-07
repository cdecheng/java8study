package com.dason.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chendecheng
 * @since 2020-06-10 22:33
 */
public class streamDemo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("8");
        list2.add("9");

        list2.stream().filter(i -> i.equals("1")).forEach(System.out::println);

//
//        list.stream().map(t -> t).parallel().forEach(System.out::println);
//        list.stream().collect(Collectors.toCollection(HashSet::new));
//
//        List<String> list2 = Arrays.asList("5", "6", "7", "8");
//        list2.stream().collect(Collectors.joining());
//        list2.stream().collect(Collectors.joining("连接符"));
//        list2.stream().collect(Collectors.joining("元素连接符", "前缀", "后缀"));
//
//        获取最小值
        list.stream().collect(Collectors.minBy(Comparator.comparing(integer -> integer))).ifPresent(System.out::println);
        // 获取平均值
        Double collect = list.stream().collect(Collectors.averagingInt(i -> i));
        System.out.println("平均值为：" + collect);
        // 字符串将元素拼接起来
        String collect1 = list2.stream().collect(Collectors.joining());
        System.out.println("拼接后的字符串" + collect1);
        String collect2 = list2.stream().collect(Collectors.joining("-"));
        System.out.println("拼接后的字符串" + collect2);


    }

}
