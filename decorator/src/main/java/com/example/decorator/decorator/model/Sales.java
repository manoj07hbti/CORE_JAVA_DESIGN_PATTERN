package com.example.decorator.decorator.model;

import com.example.decorator.decorator.repo.Department;

public class Sales implements Department {
    @Override
    public String getEmail() {
        return "sales@example.com";
    }
}
