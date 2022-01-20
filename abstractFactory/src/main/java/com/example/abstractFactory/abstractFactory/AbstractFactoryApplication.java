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

        /**
         * Department Admin: admin@example.com
         * Department Hr: hr@example.com
         * Department Sales: sales@example.com
         * Section Management: Management Section
         * Section Technology: Technology Section
         */
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
