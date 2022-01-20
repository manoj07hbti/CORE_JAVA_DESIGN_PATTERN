package com.example.abstractFactory.abstractFactory;

import com.example.abstractFactory.abstractFactory.factory.AbstractFactory;
import com.example.abstractFactory.abstractFactory.factory.FactoryProducer;
import com.example.abstractFactory.abstractFactory.repo.Department;
import com.example.abstractFactory.abstractFactory.repo.Section;

public class AbstractFactoryApplication {

    public static void main(String[] args) {

        System.out.println("Department Admin: " + getInfo("department", "admin"));
        System.out.println("Department Hr: " + getInfo("department", "hr"));
        System.out.println("Department Sales: " + getInfo("department", "sales"));

        System.out.println("Section Management: " + getInfo("section", "management"));
        System.out.println("Section Technology: " + getInfo("section", "technology"));
    }

    private static String getInfo(String type, String subType) {
        if (type.equalsIgnoreCase("department")) {
            return FactoryProducer.getFactory(type)
                    .getDepartment(subType)
                    .getEmail();
        }
        else if (type.equalsIgnoreCase("section")) {
            return FactoryProducer.getFactory(type)
                    .getSection(subType)
                    .getSection();
        }
        return null;
    }
}
