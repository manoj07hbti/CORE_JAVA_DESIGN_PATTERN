package com.example.builder.builder.model;

import java.time.LocalDate;

public final class Employee {
    private final int id;
    private final String name;
    private final String band;
    private final LocalDate dateOfJoining;

    public Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.band = builder.band;
        this.dateOfJoining = builder.dateOfJoining;
    }

    public static class EmployeeBuilder {
        private int id;
        private String name;
        private String band;
        private LocalDate dateOfJoining;

        public static EmployeeBuilder newBuilder() {
            return new EmployeeBuilder();
        }

        private EmployeeBuilder() {}

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setBand(String band) {
            this.band = band;
            return this;
        }

        public EmployeeBuilder setDateOfJoining(LocalDate dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
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
