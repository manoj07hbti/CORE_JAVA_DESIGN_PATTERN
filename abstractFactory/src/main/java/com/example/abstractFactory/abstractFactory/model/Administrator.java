package com.example.abstractFactory.abstractFactory.model;

import com.example.abstractFactory.abstractFactory.repo.Department;

public class Administrator implements Department {
    @Override
    public String getEmail() {
        return "admin@example.com";
    }
}
