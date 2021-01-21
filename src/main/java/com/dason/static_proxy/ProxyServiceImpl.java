package com.dason.static_proxy;

import java.util.logging.Logger;

/**
 * 代理实现类
 *
 * @author chendecheng
 * @since 2021-01-07 22:57
 */
public class ProxyServiceImpl implements FruitService {

    private FruitService fruitService;

    private Logger logger = Logger.getLogger(ProxyServiceImpl.class.getName());

    public ProxyServiceImpl(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @Override
    public void eat() {
        logger.info("想吃什么呢？");
        fruitService.eat();
    }
}
