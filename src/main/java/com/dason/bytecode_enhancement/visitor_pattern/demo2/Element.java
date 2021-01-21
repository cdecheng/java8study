package com.dason.bytecode_enhancement.visitor_pattern.demo2;

// 抽象的被访问者接口
public interface Element {

    void accept(ElementVisitor visitor);
}