package com.example.abstractFactory.abstractFactory.model;

import com.example.abstractFactory.abstractFactory.repo.Department;

public class HumanResource implements Department {
    @Override
    public String getEmail() {
        return "hr@example.com";
    }
}
