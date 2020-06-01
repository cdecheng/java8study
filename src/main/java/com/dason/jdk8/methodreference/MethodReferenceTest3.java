package com.dason.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * 类名：：方法名
 * 第三中方式，这种方式的引用方式，通过类的方法
 *
 * @author chendecheng
 * @since 2020-05-29 23:11
 */
public class MethodReferenceTest3 {

    public static void main(String[] args) {

        Student student1 = new Student("张震", 99);
        Student student2 = new Student("吴彦祖", 88);
        Student student3 = new Student("张学友", 80);

        List<Student> studentList = Arrays.asList(student1, student2, student3);

        //这是第三中方法引用的使用方式，我们留意到，这个调用的compareByScore2只有一个入参，但是sort()方法的入参是一个
        //Comparator 函数方法，入参是两个，为什么这里能够匹配起来呢？
        //因为通过这个方法的时候，我们发现调用compareByScore2方法的是一个Student对象实例，然后入参也是一个Student实例
        //这个函数方法就是默认将第一个比较的对象作为调用方，第二个入参最为比较方，实际上还是两个入参对于整个Comparator而言，这种方式就比较取巧了
        studentList.sort(Student::compareByScore2);
        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        //同理目前的字符串类型也可以如此比较
        List<String> list = Arrays.asList("zhagnzhen", "wuyanzu", "zhangxueyou");
        Collections.sort(list, (a, b) -> a.compareToIgnoreCase(b));
        for (String s : list) {
            System.out.println(s);
        }

        //同理，因为String 类型有个方法，是由字符串对象调用的，所以这里入参其实是两个，一个用来调用方法一个用来做对应的入参
        Collections.sort(list, String::compareToIgnoreCase);
        for (String s : list) {
            System.out.println(s);
        }

    }

}
