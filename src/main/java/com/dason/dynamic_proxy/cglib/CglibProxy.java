package com.dason.dynamic_proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理类
 *
 * @author chendecheng
 * @since 2021-01-08 00:37
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

//    // 测试类第一种方式使用的方法，为目标对象生成代理对象
//    public Object getProxyInstance() {
//        //工具类
//        Enhancer en = new Enhancer();
//        //设置父类
//        en.setSuperclass(target.getClass());
//        //设置回调函数
//        en.setCallback(this);
//        //创建子类对象代理
//        return en.create();
//    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启代理");
        // 执行目标对象的方法
        method.invoke(target, objects);
        System.out.println("结束代理");
        return null;
    }

}
