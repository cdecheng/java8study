package com.dason.jdk8.methodreference;

/**
 * 方法引用的通过对象：：方法的方式调用的实例
 *
 * @author chendecheng
 * @since 2020-05-29 23:34
 */
public class StudentCompare {

    public int compareByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

}
