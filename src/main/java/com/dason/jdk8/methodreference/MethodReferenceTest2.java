package com.dason.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 *
 * 实例对象引用方式
 *
 * @author chendecheng
 * @since 2020-05-29 23:11
 */
public class MethodReferenceTest2 {

    public static void main(String[] args) {

        Student student1 = new Student("张震", 99);
        Student student2 = new Student("吴彦祖", 88);
        Student student3 = new Student("张学友", 80);

        List<Student> studentList = Arrays.asList(student1, student2, student3);

        //跟静态方法最不一样的地方在于，静态方法就是直接引用，对象引用就是，先获取对象，然后通过对象方法调用符合我们函数式接口的入参方法
        StudentCompare compare = new StudentCompare();

        //使用实例对象 的方法引用的方式进行排序  -根据分数
        studentList.sort(compare::compareByScore);
        for (Student student : studentList) {
            System.out.println(student.getScore());
        }
        System.out.println("-----------------------");

        //使用对象的 引用的方式进行排序  -根据名称字母
        studentList.sort(compare::compareByScore);
        for (Student student : studentList) {
            System.out.println(student.getName());
        }


    }

}
