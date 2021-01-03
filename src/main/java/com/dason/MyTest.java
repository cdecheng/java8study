package com.dason;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chendecheng
 * @since 2020-06-24 18:00
 */
public class MyTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if ("2".equals(item)) {
//                iterator.remove(); }
//        }
        // 正常执行
//        for (String item : list) {
//            if ("2".equals(item)) {
//                list.remove(item); }
//        }
        // 无法正常执行，并发修改异常 java.util.ConcurrentModificationException
//        for (String item : list) {
//            if ("2".equals(item)) {
//                list.remove(item); }
//        }


        try {
            Class<?> aClass = Class.forName("com.dason.MyTest");
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }

}
