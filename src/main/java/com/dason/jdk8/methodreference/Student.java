package com.dason.jdk8.methodreference;

/**
 * 学生对象
 *
 * @author chendecheng
 * @since 2020-05-29 23:30
 */
public class Student {

    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public static int compareByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByScore2(Student student) {
        return this.getScore() - student.getScore();
    }

    public int compareByName2(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }

}
