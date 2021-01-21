package com.dason.bytecode_enhancement.visitor_pattern.demo3;

import java.util.List;

/**
 * 访问者设计模式测试类，也就是访问端
 *
 * @author chendecheng
 * @since 2021-01-10 13:08
 */
public class Test {

    public static void main(String[] args) {

//        PeopleService peopleService = new OldPeopleServiceImpl();
        PeopleService peopleService = new ChildPeopleServiceImpl();

        FruitStructure fruitStructure = new FruitStructure();
        List<FruitService> fruitServices = fruitStructure.makeFruit();
        for (FruitService fruitService : fruitServices) {
            fruitService.beEat(peopleService);
        }
    }

}
