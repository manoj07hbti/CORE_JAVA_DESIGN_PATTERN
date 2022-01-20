package com.example.mvc.mvc.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeView {
    public void print(int id, String name, String band, LocalDate dateOfJoining) {
        System.out.println(String.format("Employee: ID: %d, Name: %s, Designation: %s, Date of Joining: %s", id, name, band, dateOfJoining.format(DateTimeFormatter.ISO_DATE)));
    }
}
