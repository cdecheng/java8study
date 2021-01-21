package com.dason.static_proxy;

import java.util.logging.Logger;

/**
 * 香蕉
 *
 * @author chendecheng
 * @since 2021-01-07 22:55
 */
public class BananaServiceImpl implements FruitService {

    private Logger logger = Logger.getLogger(BananaServiceImpl.class.getName());

    @Override
    public void eat() {
        logger.info("吃个大香蕉");
    }
}
