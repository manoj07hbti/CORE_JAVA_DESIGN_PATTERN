package com.example.factory.factory.factory;

import com.example.factory.factory.model.Administration;
import com.example.factory.factory.model.HumanResource;
import com.example.factory.factory.model.Sales;
import com.example.factory.factory.repo.Department;

public class DepartmentFactory {
    public Department getDepartment(String name) {
        if (name == null) {
            return null;
        }
        else if (name.equalsIgnoreCase("admin")) {
            return new Administration();
        }
        else if (name.equalsIgnoreCase("hr")) {
            return new HumanResource();
        }
        else if (name.equalsIgnoreCase("sales")) {
            return new Sales();
        }
        return null;
    }
}
