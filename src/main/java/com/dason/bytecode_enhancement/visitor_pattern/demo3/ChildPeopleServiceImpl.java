package com.dason.bytecode_enhancement.visitor_pattern.demo3;

/**
 * 访问者的具体实现
 * 这里是小朋友吃水果
 *
 * @author chendecheng
 * @since 2021-01-10 13:00
 */
public class ChildPeopleServiceImpl implements PeopleService{

    @Override
    public void eat(BananaServiceImpl bananaService) {
        bananaService.like();
    }

    @Override
    public void eat(AppleServiceImpl appleService) {
        appleService.like();
    }
}
