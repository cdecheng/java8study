package com.dason.bytecode_enhancement.visitor_pattern.demo2;

import java.util.List;
import java.util.logging.Logger;

public class ClientWithoutVisitor {

    static Logger log = Logger.getLogger(ClientWithoutVisitor.class.getName());

    public static void main(String[] args) {
        ElementStructure structure = new ElementStructure();
//        structure.addElement(new Wheel("front left"));
//        structure.addElement(new Wheel("front right"));
//        structure.addElement(new Wheel("back left"));
//        structure.addElement(new Wheel("back right"));
//        structure.addElement(new Body());
//        structure.addElement(new Engine());
//        structure.addElement(new Car());

        List<Element> list = structure.elementList();

        list.forEach(e -> {
            if (e instanceof Body) {
                log.info("Moving my body");
            } else if (e instanceof Engine) {
                log.info("Starting my engine");
            } else if (e instanceof Car) {
                log.info("Starting my car");
            } else if (e instanceof Wheel) {
                log.info("Kicking my " + ((Wheel) e).getName() + " wheel");
            }
        });

    }

}