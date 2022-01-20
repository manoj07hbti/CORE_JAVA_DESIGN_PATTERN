package com.example.dao.dao.model;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String band;
    private LocalDate dateOfJoining;

    public Employee(int id, String name, String band, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.band = band;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBand() {
        return band;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", band='" + band + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
