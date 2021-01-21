package com.dason.bytecode_enhancement.visitor_pattern.demo2;

// 具体被访问者接口实现类-车身
public class Body implements Element {

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }
}