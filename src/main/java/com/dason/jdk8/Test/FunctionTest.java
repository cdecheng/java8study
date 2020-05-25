package com.dason.jdk8.Test;

import java.util.function.Function;

/**
 * 函数接口Function的demo
 *
 * @author chendecheng
 * @since 2020-05-24 13:22
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        functionTest.compute(3, value -> {return value * 3;});
        functionTest.compute(3, value -> {return value + 3;});
        functionTest.compute(3, value -> {return value / 3;});
        functionTest.compute(3, value -> {return value - 3;});

        functionTest.method1(3);
        functionTest.method2(3);
        functionTest.method3(3);
        functionTest.method4(3);
    }

    public int compute(int a, Function<Integer, Integer> function) {
        Integer apply = function.apply(a);
        return apply;
    }


    private int method1(int a) {
        return a * 3;
    }
    private int method2(int a) {
        return a + 3;
    }
    private int method3(int a) {
        return a / 3;
    }
    private int method4(int a) {
        return a - 3;
    }
}
