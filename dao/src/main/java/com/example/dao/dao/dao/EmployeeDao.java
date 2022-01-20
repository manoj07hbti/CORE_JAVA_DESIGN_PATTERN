package com.example.dao.dao.dao;

import com.example.dao.dao.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDao implements Dao<Employee> {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeDao() {
        employees.add(new Employee(101, "John Doe", "Jr. Associate", LocalDate.of(2000, 01, 01)));
        employees.add(new Employee(102, "Jane Doe", "Sr. Associate", LocalDate.of(2010, 10, 01)));
        employees.add(new Employee(103, "Jake Doe", "Lead Associate", LocalDate.of(2015, 12, 01)));
    }

    @Override
    public Optional<Employee> get(long id) {
        return employees
                .stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }
}
