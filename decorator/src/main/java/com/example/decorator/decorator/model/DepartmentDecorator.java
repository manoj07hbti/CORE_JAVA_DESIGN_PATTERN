package com.example.decorator.decorator.model;

import com.example.decorator.decorator.repo.Department;

public abstract class DepartmentDecorator implements Department {

    protected Department department;

    public DepartmentDecorator(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return department.getEmail();
    }
}
