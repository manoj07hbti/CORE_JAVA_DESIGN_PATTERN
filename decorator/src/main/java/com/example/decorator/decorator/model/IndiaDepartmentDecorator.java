package com.example.decorator.decorator.model;

import com.example.decorator.decorator.repo.Department;

public class IndiaDepartmentDecorator extends DepartmentDecorator {

    public IndiaDepartmentDecorator(Department department) {
        super(department);
    }

    @Override
    public String getEmail() {
        return String.join(".", "india", department.getEmail());
    }
}
