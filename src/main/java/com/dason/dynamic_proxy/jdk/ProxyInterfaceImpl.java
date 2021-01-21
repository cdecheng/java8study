package com.dason.dynamic_proxy.jdk;

import java.util.logging.Logger;

/**
 * 接口实现类
 *
 * @author chendecheng
 * @since 2021-01-02 23:28
 */
public class ProxyInterfaceImpl implements ProxyInterface {

    private Logger logger = Logger.getLogger(ProxyInterfaceImpl.class.getName());

    @Override
    public void syaHello(String message) {
        logger.info("张震想说" + message);
    }
}
