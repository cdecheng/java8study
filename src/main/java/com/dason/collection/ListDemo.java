package com.dason.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合简单demo
 *
 * @author chendecheng
 * @since 2020-11-19 23:56
 */
public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("zhang");
        list.add("zhen");

        for (String s : list) {
//            list.removeIf(item -> item.equals("zhen"));
            if (s.equals("zhen")) {
                list.add("laozhang");
            }
        }
        System.out.println("元素为：" + list.toString());

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equals("zhen")) {
//                list.remove(next);
//            }
//        }

    }

}
