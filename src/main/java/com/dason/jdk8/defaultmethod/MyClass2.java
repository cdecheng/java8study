package com.dason.jdk8.defaultmethod;

/**
 * 测试实现类跟接口默认方法一样，其子类使用的是哪个
 * 优先级是实现类的，再到接口的，所以默认是使用继承的父类的方法
 *
 * @author chendecheng
 * @since 2020-06-01 11:22
 */
public class MyClass2 extends MyFatherClass implements MyInteface1{

    public static void main(String[] args) {
        MyClass2 myClass = new MyClass2();
        myClass.say();
    }
}
