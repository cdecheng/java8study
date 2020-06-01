package com.dason.jdk8.Test;

import java.util.function.Supplier;

/**
 * Supplier demo 记住核心，没有入参返回一个对象
 *
 * @author chendecheng
 * @since 2020-05-26 00:08
 */
public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> new Integer(3);
        System.out.println(supplier.get());

        //----------------这个是通过构造引用方式创建1

        Supplier<String> stringSupplier = String::new;
        System.out.println(stringSupplier.get());
    }

}
