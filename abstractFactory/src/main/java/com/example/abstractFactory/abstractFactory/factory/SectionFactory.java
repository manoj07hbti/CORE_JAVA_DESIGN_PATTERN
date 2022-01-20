package com.example.abstractFactory.abstractFactory.factory;

import com.example.abstractFactory.abstractFactory.model.Management;
import com.example.abstractFactory.abstractFactory.model.Technology;
import com.example.abstractFactory.abstractFactory.repo.Department;
import com.example.abstractFactory.abstractFactory.repo.Section;

public class SectionFactory extends AbstractFactory {

    @Override
    public Department getDepartment(String departmentName) {
        return null;
    }

    @Override
    public Section getSection(String sectionName) {
        if (sectionName == null) {
            return null;
        }
        else if (sectionName.equalsIgnoreCase("management")) {
            return new Management();
        }
        else if (sectionName.equalsIgnoreCase("technology")) {
            return new Technology();
        }
        return null;
    }
}
