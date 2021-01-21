package com.dason.bytecode_enhancement.visitor_pattern.demo3;

/**
 * 定义一个被访问者的接口，统一提供一个对外方法
 */
public interface FruitService {

    /**
     * 水果被吃
     */
    void beEat(PeopleService peopleService);

}
