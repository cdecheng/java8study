package com.dason.reflect;

/**
 * 测试静态类
 *
 * @author chendecheng
 * @since 2021-01-02 15:44
 */
public class StringUtil {

    public static String name = "json";

    /**
     * 没有返回值，没有参数
     */
    public static void getTips() {
        System.out.println("执行了---------1111");
    }

    /**
     * 有返回值，没有参数
     */
    public static String getTip() {
        System.out.println("执行了---------2222");
        return "tip2";
    }

    /**
     * 没有返回值，有参数
     */
    public static void getTip(String name) {
        System.out.println("执行了---------3333 参数： " + name);
    }

    /**
     * 有返回值，有参数
     */
    public static String getTip(int id) {
        System.out.println("执行了---------4444 参数： " + id);
        if (id == 0) {
            return "tip1 444 --1 ";
        } else {
            return "tip1 444 --2";
        }
    }


}
