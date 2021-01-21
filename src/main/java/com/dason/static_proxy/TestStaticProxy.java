package com.dason.static_proxy;

/**
 * 测试一下静态代理
 *
 * @author chendecheng
 * @since 2021-01-07 23:00
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        FruitService fruitService = new BananaServiceImpl();
        ProxyServiceImpl proxyService = new ProxyServiceImpl(fruitService);
        proxyService.eat();
    }

}
