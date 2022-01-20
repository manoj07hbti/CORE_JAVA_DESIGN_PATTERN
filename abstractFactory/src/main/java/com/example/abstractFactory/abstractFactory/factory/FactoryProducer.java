package com.example.abstractFactory.abstractFactory.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type == null) {
            return null;
        }
        else if (type.equalsIgnoreCase("department")) {
            return new DepartmentFactory();
        }
        else if (type.equalsIgnoreCase("section")) {
            return new SectionFactory();
        }
        return null;
    }
}
