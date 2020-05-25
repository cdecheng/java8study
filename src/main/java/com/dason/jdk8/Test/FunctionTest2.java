package com.dason.jdk8.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 函数接口Function的demo
 *
 * @author chendecheng
 * @since 2020-05-24 13:22
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();

        //---------------------------Function 连个默认方法使用-----------------------------


        //返回结果是12--实际流程是2作为参数，先是执行function2，执行结果作为function1的入参，2*2-》4*3=12
        int compute = functionTest2.compute(2, value -> value * 3, value -> value * value);
        //返回结果是36--实际流程是2作为参数，先是执行function1，执行结果作为function2的入参，2*3-》6*6=36
        int compute2 = functionTest2.compute2(2, value -> value * 3, value -> value * value);

        System.out.println(compute);
        System.out.println(compute2);

        //---------------------------BiFunction-------------------------------------------
        int add = functionTest2.compute3(1, 2, (a, b) -> a + b);
        int sub = functionTest2.compute3(1, 2, (a, b) -> a - b);
        int cheng = functionTest2.compute3(1, 2, (a, b) -> a * b);
        int chu = functionTest2.compute3(1, 2, (a, b) -> a / b);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(cheng);
        System.out.println(chu);

    }

    public int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer> biFunction) {
        return biFunction.apply(a, b);
    }

}
