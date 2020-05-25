package com.dason.jdk8.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate学习简单demo
 *
 * @author chendecheng
 * @since 2020-05-24 23:30
 */
public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        PredicateTest predicateTest = new PredicateTest();
//        predicateTest.filterData(list, item -> item % 2 == 0);//打印过滤偶数
//        predicateTest.filterData(list, item -> item % 2 != 0);//奇数

        //---------------------------Predicate 默认方法 demo-------------------------------------

        predicateTest.defaultMethod(list, item -> item > 5, item2 -> item2 == 6);

        //---------------------------Predicate 默认方法 demo-------------------------------------

    }

    private void filterData(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    private void defaultMethod(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            //and 方法测试
            if (predicate1.and(predicate2).test(integer)) {
                System.out.println("表达式判断结果都成立："+integer);
            }
            //negate 方法测试
            if (predicate1.negate().test(integer)) {
                System.out.println("表达式判断结果相反：" + integer);
            }
            //or 方法测试
            if (predicate1.or(predicate2).test(integer)) {
                System.out.println("两个方法条件一个成立：" + integer);
            }
        }
    }

}
