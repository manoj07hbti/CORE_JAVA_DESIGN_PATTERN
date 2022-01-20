package com.example.mvc.mvc.model;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
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
