package com.example.factory.factory.model;

import com.example.factory.factory.repo.Department;

public class Administration implements Department {
    @Override
    public String getEmail() {
        return "admin@example.com";
    }
}
