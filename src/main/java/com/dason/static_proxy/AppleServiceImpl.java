package com.dason.static_proxy;

import java.util.logging.Logger;

/**
 * 吃苹果了
 *
 * @author chendecheng
 * @since 2021-01-07 22:58
 */
public class AppleServiceImpl implements FruitService {

    private Logger logger = Logger.getLogger(AppleServiceImpl.class.getName());

    @Override
    public void eat() {
        logger.info("吃个大苹果");
    }
}
