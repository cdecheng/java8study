package com.dason.bytecode_enhancement.visitor_pattern.demo3;

/**
 * 访问者实现类
 * 老人吃水果
 *
 * @author chendecheng
 * @since 2021-01-10 13:03
 */
public class OldPeopleServiceImpl implements PeopleService{

    @Override
    public void eat(BananaServiceImpl bananaService) {
        bananaService.like();
    }

    @Override
    public void eat(AppleServiceImpl appleService) {
        appleService.disLike();
    }
}
