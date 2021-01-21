package com.dason.bytecode_enhancement.visitor_pattern.demo2;

// 具体被访问者接口实现类-整车
public class Car implements Element {

    public void accept(final ElementVisitor visitor) {
        visitor.visit(this);
    }

}