package com.dason.bytecode_enhancement.visitor_pattern.demo2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//单独还定义对象结构，其实完全可以使用列表就可以
@Getter
@Setter
public class ElementStructure {

    private List<Element> list = new ArrayList<>();

    public ElementStructure() {
        addElement(new Wheel("front left"));
        addElement(new Wheel("front right"));
        addElement(new Wheel("back left"));
        addElement(new Wheel("back right"));
        addElement(new Body());
        addElement(new Engine());
        addElement(new Car());
    }

    public List<Element> elementList() {
        return list;
    }

    public void addElement(Element element){
        list.add(element);
    }

}