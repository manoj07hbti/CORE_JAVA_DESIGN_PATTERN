package com.example.abstractFactory.abstractFactory.model;

import com.example.abstractFactory.abstractFactory.repo.Section;

public class Management implements Section {
    @Override
    public String getSection() {
        return "Management Section";
    }
}
