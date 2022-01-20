package com.example.mvc.mvc.controller;

import com.example.mvc.mvc.model.Employee;
import com.example.mvc.mvc.view.EmployeeView;

import java.time.LocalDate;

public class EmployeeController {
    private Employee employee;
    private EmployeeView employeeView;

    public EmployeeController(Employee employee, EmployeeView employeeView) {
        this.employee = employee;
        this.employeeView = employeeView;
    }

    public void setId(int id) {
        employee.setId(id);
    }

    public int getId() {
        return employee.getId();
    }

    public void setName(String name) {
        employee.setName(name);
    }

    public String getName() {
        return employee.getName();
    }

    public void setBand(String band) {
        employee.setBand(band);
    }

    public String getBand() {
        return employee.getBand();
    }

    public void getDateOfJoining(LocalDate date) {
        employee.setDateOfJoining(date);
    }

    public LocalDate getDateOfJoining() {
        return employee.getDateOfJoining();
    }

    public void updateView(){
        employeeView.print(employee.getId(), employee.getName(), employee.getBand(), employee.getDateOfJoining());
    }
}
