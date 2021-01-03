package com.dason.reflect.dynamicproxy;

/**
 * 接口实现类
 *
 * @author chendecheng
 * @since 2021-01-02 23:28
 */
public class ProxyInterfaceImpl implements ProxyInterface {

    @Override
    public String syaHello(String message) {
        System.out.println("张震想说" + message);
        return "张震最帅";
    }
}
