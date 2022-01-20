package com.example.abstractFactory.abstractFactory.model;

import com.example.abstractFactory.abstractFactory.repo.Section;

public class Technology implements Section {
    @Override
    public String getSection() {
        return "Technology Section";
    }
}
