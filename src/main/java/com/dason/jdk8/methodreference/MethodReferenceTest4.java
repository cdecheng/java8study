package com.dason.jdk8.methodreference;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 *
 * 第四种就是构造方法引用： 类名::new
 *
 * @author chendecheng
 * @since 2020-05-29 23:11
 */
public class MethodReferenceTest4 {

    public static void main(String[] args) {

        MethodReferenceTest4 methodReferenceTest4 = new MethodReferenceTest4();

        //这种方式就是第四种构造方法引用了，就是类名::new
        methodReferenceTest4.getString(String::new);
        methodReferenceTest4.getString2("zhangzhen", String::new);
    }

    //方法就是 接收一个Supplier 函数式接口，就是没有入参返回一个字符串对象
    //然后String的无参构造方法正是如此，不接受参数，返回一个字符串对象
    private String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    //方法就是接收一个字符串，然后这个字符串经过function处理之后返回一个字符串
    //然后就是String的一个入参构造方法正是如此
    private String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }

}
