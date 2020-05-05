package com.dason.jdk8.Test;

@FunctionalInterface
interface InnerFunInterface {

    void test();

    //这个Object的方法，所以不再抽象方法统计个数中
    String toString();

}


/**
 * @author chendecheng
 * @since 2020-05-05 16:52
 */
public class Test1 {

    public void myTest(InnerFunInterface innerFunInterface) {
        System.out.println(1);
        innerFunInterface.test();
        System.out.println(3);
    }

    //传统的方式
//    public static void main(String[] args) {
//        Test1 test1 = new Test1();
//        test1.myTest(new InnerFunInterface() {
//            @Override
//            public void test() {
//                System.out.println("我是张震");
//            }
//        });
//    }

    //lambda方式
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        test1.myTest(() -> {
            System.out.println("使用lambda方式处理");
        });

        test1.myTest(System.out::println);

        InnerFunInterface innerFunInterface = () -> {
            System.out.println("广东张震是我");
        };
        System.out.println(innerFunInterface.getClass());
        System.out.println(innerFunInterface.getClass().getSuperclass());
        System.out.println(innerFunInterface.getClass().getInterfaces()[0]);

    }

}
