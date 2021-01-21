package com.dason.bytecode_enhancement.visitor_pattern.demo2;

// 具体被访问者接口实现类-车轮
public class Wheel implements Element {

    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    @Override
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}