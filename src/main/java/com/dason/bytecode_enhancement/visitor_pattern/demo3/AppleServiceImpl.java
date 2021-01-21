package com.dason.bytecode_enhancement.visitor_pattern.demo3;

import java.util.logging.Logger;

/**
 * 苹果的访问实现类
 *
 * @author chendecheng
 * @since 2021-01-10 12:50
 */
public class AppleServiceImpl implements FruitService {

    Logger logger = Logger.getLogger(AppleServiceImpl.class.getName());

    @Override
    public void beEat(PeopleService peopleService) {
        peopleService.eat(this);
    }

    public void like() {
        logger.info("喜欢吃苹果");
    }

    public void disLike() {
        logger.info("不喜欢吃苹果");
    }
}
