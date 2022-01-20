package com.example.factory.factory.model;

import com.example.factory.factory.repo.Department;

public class HumanResource implements Department {
    @Override
    public String getEmail() {
        return "hr@example.com";
    }
}
