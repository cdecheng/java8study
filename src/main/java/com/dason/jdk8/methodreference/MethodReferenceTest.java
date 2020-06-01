package com.dason.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * 方法引用demo
 * 静态方法引用方式
 *
 * @author chendecheng
 * @since 2020-05-27 23:41
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("zhagnzhen", "zuishuai", "niubi");
//        //传统方式
//        list.forEach(item -> System.out.println(item));
//        //方法引用方式
//        list.forEach(System.out::println);


        Student student1 = new Student("张震", 99);
        Student student2 = new Student("吴彦祖", 88);
        Student student3 = new Student("张学友", 80);

        List<Student> studentList = Arrays.asList(student1, student2, student3);

        // 使用lambda 表达式的方式进行排序 -根据分数
        studentList.sort((a, b) -> Student.compareByScore(a, b));
        for (Student student : studentList) {
            System.out.println(student.getScore());
        }
        //使用静态方法的方法引用的方式进行排序  -根据分数
        studentList.sort(Student::compareByScore);
        for (Student student : studentList) {
            System.out.println(student.getScore());
        }
        System.out.println("-----------------------");


        // 使用lambda 表达式的方式进行排序 -根据名称字母
        studentList.sort((a, b) -> Student.compareByName(a, b));
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        //使用静态方法的方法引用的方式进行排序  -根据名称字母
        studentList.sort(Student::compareByScore);
        for (Student student : studentList) {
            System.out.println(student.getName());
        }

    }

}
