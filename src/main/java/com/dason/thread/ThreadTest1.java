package com.dason.thread;

/**
 * 多线程入门demo
 *
 * @author chendecheng
 * @since 2020-05-29 16:43
 */
public class ThreadTest1 {

    public static void main(String[] args) {

        new MyThread().start();

        // Java 8 函数式编程，可以省略MyThread类
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Java 8 匿名内部类");
            System.out.println("-------------");
        }).start();
    }

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("MyThread");
            System.out.println("--------------");
        }

    }


}
