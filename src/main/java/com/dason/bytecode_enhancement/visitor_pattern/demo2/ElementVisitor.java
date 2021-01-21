package com.dason.bytecode_enhancement.visitor_pattern.demo2;

//抽象访问者
public interface ElementVisitor {

    void visit(Body body);

    void visit(Engine engine);

    void visit(Wheel wheel);

    void visit(Car car);
}