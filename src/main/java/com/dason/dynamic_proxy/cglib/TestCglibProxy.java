package com.dason.dynamic_proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 调用端测试类
 *
 * @author chendecheng
 * @since 2021-01-08 00:37
 */
public class TestCglibProxy {

    public static void main(String[] args) {

        StudentDo studentDo = new StudentDo();

        // 第一种：这种方式是客户端的代理类对象由对应的代理对象提供
//        StudentDo studentProxy = (StudentDo) new CglibProxy(studentDo).getProxyInstance();
//        studentProxy.study();

        // 第二种：另一种就是自行由调用端直接创建代理
        CglibProxy cglibProxy = new CglibProxy(studentDo);
        //工具类
        Enhancer en = new Enhancer();
        //设置父类
        en.setSuperclass(studentDo.getClass());
        //设置回调函数
        en.setCallback(cglibProxy);
        StudentDo anotherProxy = (StudentDo) en.create();
        anotherProxy.study();

    }

}
