package com.dason.bytecode_enhancement.visitor_pattern.demo2;

import java.util.List;

public class ClientWithVisitor {

    public static void main(String[] args) {
        ElementStructure structure = new ElementStructure();

        /**
         * 访问者2进行数据列表的访问操作
         */
        DoAnOtherElementVisitor doAnOtherElementVisitor = new DoAnOtherElementVisitor();
        List<Element> list = structure.elementList();
        for (Element element : list) {
            element.accept(doAnOtherElementVisitor);
        }

        /**
         * 访问者1进行数据结构列表的数据访问操作
         */
        DoElementVisitor doElementVisitor = new DoElementVisitor();
        List<Element> list2 = structure.elementList();
        for (Element element : list2) {
            element.accept(doElementVisitor);
        }

    }
}