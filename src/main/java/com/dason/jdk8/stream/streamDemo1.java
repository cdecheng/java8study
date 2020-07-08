package com.dason.jdk8.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chendecheng
 * @since 2020-06-10 22:33
 */
public class streamDemo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        list.stream().collect(Collectors.toList());

        Iterator<Integer> iterator = list.iterator();
        if (iterator.hasNext()) {
            Integer next = iterator.next();
        }
    }

}
