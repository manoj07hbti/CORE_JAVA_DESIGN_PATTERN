package com.example.dao.dao;

import com.example.dao.dao.dao.Dao;
import com.example.dao.dao.dao.EmployeeDao;
import com.example.dao.dao.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DaoApplication {

	public static void main(String[] args) {
		Dao<Employee> employeeDao = new EmployeeDao();

		System.out.println("Print All Employees");
		System.out.println(employeeDao.getAll());

		System.out.println();
		System.out.println("Print Employee by ID 102");
		System.out.println(employeeDao.get(102));

		System.out.println();
		System.out.println("Add new employee");
		Employee newEmp = new Employee(104, "Some Employee", "Some Band", LocalDate.now());
		employeeDao.save(newEmp);
		System.out.println(employeeDao.getAll());

		System.out.println();
		System.out.println("Remove the Employee");
		employeeDao.delete(newEmp);
		System.out.println(employeeDao.getAll());

		/**
		 * Print All Employees
		 * [Employee{id=101, name='John Doe', band='Jr. Associate', dateOfJoining=2000-01-01}, Employee{id=102, name='Jane Doe', band='Sr. Associate', dateOfJoining=2010-10-01}, Employee{id=103, name='Jake Doe', band='Lead Associate', dateOfJoining=2015-12-01}]
		 *
		 * Print Employee by ID 102
		 * Optional[Employee{id=102, name='Jane Doe', band='Sr. Associate', dateOfJoining=2010-10-01}]
		 *
		 * Add new employee
		 * [Employee{id=101, name='John Doe', band='Jr. Associate', dateOfJoining=2000-01-01}, Employee{id=102, name='Jane Doe', band='Sr. Associate', dateOfJoining=2010-10-01}, Employee{id=103, name='Jake Doe', band='Lead Associate', dateOfJoining=2015-12-01}, Employee{id=104, name='Some Employee', band='Some Band', dateOfJoining=2022-01-21}]
		 *
		 * Remove the Employee
		 * [Employee{id=101, name='John Doe', band='Jr. Associate', dateOfJoining=2000-01-01}, Employee{id=102, name='Jane Doe', band='Sr. Associate', dateOfJoining=2010-10-01}, Employee{id=103, name='Jake Doe', band='Lead Associate', dateOfJoining=2015-12-01}]
		 */
	}

}
