package com.dason.jdk8.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author chendecheng
 * @since 2020-05-05 18:07
 */
public class Test2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("当前输出的整数为：" + integer);
//            }
//        });

        list.forEach(result -> System.out.println("当前输出的整数：" + result));

    }

}
