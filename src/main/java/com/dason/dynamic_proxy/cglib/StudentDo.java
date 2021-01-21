package com.dason.dynamic_proxy.cglib;

import java.util.logging.Logger;

/**
 * 被代理类
 *
 * @author chendecheng
 * @since 2021-01-08 00:35
 */
public class StudentDo {

    private Logger logger = Logger.getLogger(StudentDo.class.getName());

    public void study() {
        logger.info("学生学习");
    }

}
