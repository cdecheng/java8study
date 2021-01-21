package com.dason.bytecode_enhancement.visitor_pattern.demo2;

// 具体被访问者接口实现类-引擎
public class Engine implements Element {

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}