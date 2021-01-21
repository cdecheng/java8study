package com.dason.bytecode_enhancement.visitor_pattern.demo3;


import java.util.logging.Logger;

/**
 * 香蕉的访问实现类
 *
 * @author chendecheng
 * @since 2021-01-10 12:48
 */
public class BananaServiceImpl implements FruitService{

    Logger logger = Logger.getLogger(BananaServiceImpl.class.getName());

    @Override
    public void beEat(PeopleService peopleService) {
        peopleService.eat(this);
    }

    public void like() {
        logger.info("喜欢吃香蕉");
    }

    public void disLike() {
        logger.info("不喜欢吃香蕉");
    }

}
