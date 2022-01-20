package com.example.decorator.decorator.model;

import com.example.decorator.decorator.repo.Department;

public class HumanResource implements Department {
    @Override
    public String getEmail() {
        return "hr@example.com";
    }
}
