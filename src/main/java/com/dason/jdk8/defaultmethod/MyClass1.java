package com.dason.jdk8.defaultmethod;

/**
 * 测试一个类继承两个接口，其中接口默认方法一样，其子类使用的是哪个
 *
 * @author chendecheng
 * @since 2020-06-01 11:22
 */
public class MyClass1 implements MyInteface1,MyInteface2{

    public static void main(String[] args) {
        MyClass1 myClass = new MyClass1();
        myClass.say();
    }

    /**
     * 两个接口都有一样的默认方法，就需要重写，重写可以直接通过接口名称.super.method来调用
     */
    @Override
    public void say() {
        MyInteface2.super.say();
    }
}
