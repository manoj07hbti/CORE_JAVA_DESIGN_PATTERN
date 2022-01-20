package com.example.abstractFactory.abstractFactory.factory;

import com.example.abstractFactory.abstractFactory.model.Administrator;
import com.example.abstractFactory.abstractFactory.model.HumanResource;
import com.example.abstractFactory.abstractFactory.model.Sales;
import com.example.abstractFactory.abstractFactory.repo.Department;
import com.example.abstractFactory.abstractFactory.repo.Section;

public class DepartmentFactory extends AbstractFactory {
    @Override
    public Department getDepartment(String departmentName) {
        if (departmentName == null) {
            return null;
        }
        else if (departmentName.equalsIgnoreCase("admin")) {
            return new Administrator();
        }
        else if (departmentName.equalsIgnoreCase("hr")) {
            return new HumanResource();
        }
        else if (departmentName.equalsIgnoreCase("sales")) {
            return new Sales();
        }
        return null;
    }

    @Override
    public Section getSection(String sectionName) {
        return null;
    }
}
