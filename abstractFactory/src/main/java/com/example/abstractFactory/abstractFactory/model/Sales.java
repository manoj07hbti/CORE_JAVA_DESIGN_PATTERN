package com.example.abstractFactory.abstractFactory.model;

import com.example.abstractFactory.abstractFactory.repo.Department;

public class Sales implements Department {
    @Override
    public String getEmail() {
        return "sales@example.com";
    }
}
