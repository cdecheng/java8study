package com.dason.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * jdk 动态代理的对象需要额外做的处理，也就是字节修改
 * 这里是通过构造方法引入实际代理的对象，因为是代理的类型是通用的，所以代理的对象是Object
 *
 * @author chendecheng
 * @since 2021-01-02 23:29
 */
public class MyInvocationHandler implements InvocationHandler {

    private Logger logger = Logger.getLogger(MyInvocationHandler.class.getName());

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info("代理来，所以前面插入点东西");
        // 通过反射的方式，调用对象中原有的方法。这里即使反射的知识点来，我们通过InvocationHandler
        // 创建了对应的实例的对象，然后还有对象的方法，以及方法的入参，都提取出来了，在这里统一调用, 所以这里是通过反射调用方法
        method.invoke(target, args);
        logger.info("代理了，所以后面也插入点东西");
        return null;
    }

}
