package com.dason.bytecode_enhancement.visitor_pattern.demo3;


/**
 * 定义一个访问水果的访问者接口
 * 这里是吃水果
 */
public interface PeopleService {

    /**
     * 吃香蕉
     */
    void eat(BananaServiceImpl bananaService);

    /**
     * 吃苹果
     */
    void eat(AppleServiceImpl appleService);

}
