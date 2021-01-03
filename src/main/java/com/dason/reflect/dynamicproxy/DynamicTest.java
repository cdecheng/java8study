package com.dason.reflect.dynamicproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理的使用，通过测试类来处理，不仅仅是调用方法，这里还会构造对应的代理对象
 *
 * @author chendecheng
 * @since 2021-01-02 23:34
 */
public class DynamicTest {
    public static void main(String[] args) throws Exception {
        // ---------------------第一种方式，使用封装好的方式---------------------
        ProxyInterface proxyInterface = new ProxyInterfaceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(proxyInterface);
        // 首先是构造接口的实现类 --- 这里是构造了一个ProxyInterface的实现类
        ProxyInterface newProxyInstance = (ProxyInterface) Proxy.newProxyInstance(ProxyInterface.class.getClassLoader(),
                proxyInterface.getClass().getInterfaces(), invocationHandler);
        System.out.println(newProxyInstance.syaHello("6666666"));

        // ---------------------第二种方式，也就是第一种方式的细分---------------------
        // 生成 $Proxy0$ 的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(ProxyInterface.class.getClassLoader());
        // 3、获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        // 4、通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        ProxyInterface proxyInterface1 = (ProxyInterface) constructor.newInstance(new MyInvocationHandler(new ProxyInterfaceImpl()));
        // 5、通过代理对象调用目标方法
        proxyInterface1.syaHello("另一种代理方式");

    }
}
