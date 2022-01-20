package com.example.abstractFactory.abstractFactory.factory;

import com.example.abstractFactory.abstractFactory.repo.Department;
import com.example.abstractFactory.abstractFactory.repo.Section;

public abstract class AbstractFactory {
    public abstract Department getDepartment(String departmentName);
    public abstract Section getSection(String sectionName);
}
