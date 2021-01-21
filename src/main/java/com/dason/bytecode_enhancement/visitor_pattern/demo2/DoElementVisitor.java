package com.dason.bytecode_enhancement.visitor_pattern.demo2;

import java.util.logging.Logger;

//具体的一个访问者，纯打印
public class DoElementVisitor implements ElementVisitor {

    Logger log = Logger.getLogger(DoElementVisitor.class.getName());

    @Override
    public void visit(Body body) {
        log.info("Moving my body");
    }

    @Override
    public void visit(Engine engine) {
        log.info("Starting my engine");
    }

    @Override
    public void visit(Wheel wheel) {
        log.info("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Car car) {
        log.info("Starting my car");
    }
}