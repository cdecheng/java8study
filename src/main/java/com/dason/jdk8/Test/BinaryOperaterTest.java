package com.dason.jdk8.Test;

import java.util.function.BinaryOperator;

/**
 * BinaryOprator demo
 *
 * @author chendecheng
 * @since 2020-05-25 23:58
 */
public class BinaryOperaterTest {

    public static void main(String[] args) {
        BinaryOperaterTest binaryOperaterTest = new BinaryOperaterTest();
        binaryOperaterTest.compute(1, 2, (a, b) -> a + b);
        binaryOperaterTest.compute(1, 2, (a, b) -> a - b);
    }

    private int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

}
