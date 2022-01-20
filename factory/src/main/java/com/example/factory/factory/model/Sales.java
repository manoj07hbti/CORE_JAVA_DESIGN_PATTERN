package com.example.factory.factory.model;

import com.example.factory.factory.repo.Department;

public class Sales implements Department {
    @Override
    public String getEmail() {
        return "sales@example.com";
    }
}
