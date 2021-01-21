package com.dason.bytecode_enhancement.visitor_pattern.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者数据的结构，其实就是提供数据的，也就是构造数据，可以是直接一个集合即可
 *
 * @author chendecheng
 * @since 2021-01-10 12:52
 */
public class FruitStructure {

    public List<FruitService> makeFruit() {
        List<FruitService> structureData = new ArrayList<>();
        FruitService appleService = new AppleServiceImpl();
        FruitService bananaService = new BananaServiceImpl();
        structureData.add(appleService);
        structureData.add(bananaService);
        return structureData;
    }

}
