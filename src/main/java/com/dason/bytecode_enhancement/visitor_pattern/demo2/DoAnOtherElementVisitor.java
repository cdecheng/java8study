package com.dason.bytecode_enhancement.visitor_pattern.demo2;

import java.util.logging.Logger;

/**
 * 访问者接口实现类2
 *
 * @author chendecheng
 * @since 2021-01-10 00:58
 */
public class DoAnOtherElementVisitor implements ElementVisitor{

    Logger logger = Logger.getLogger(DoAnOtherElementVisitor.class.getName());

    @Override
    public void visit(Body body) {
        logger.info("另一个人访问body");
    }

    @Override
    public void visit(Engine engine) {
        logger.info("另一个人访问engine");
    }

    @Override
    public void visit(Wheel wheel) {
        logger.info("另一个人访问wheel");
    }

    @Override
    public void visit(Car car) {
        logger.info("另一个人访问car");
    }
}
