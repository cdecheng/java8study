package com.dason.jdk8.Test;

import java.util.Optional;

/**
 * Optional 对象的demo
 *
 * @author chendecheng
 * @since 2020-05-26 23:46
 */
public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> shuaige = Optional.of("zhagnzhen");
        //这个是面向对象的思维使用--不建议
//        if (shuaige.isPresent()) {
//            System.out.println(shuaige.get());
//        }

        //新的lamba的方式写--推荐使用Optional的使用方式
        shuaige.ifPresent(item -> System.out.println(shuaige.get()));

    }

}
