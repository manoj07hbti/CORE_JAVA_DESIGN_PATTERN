package com.example.mvc.mvc;

import com.example.mvc.mvc.controller.EmployeeController;
import com.example.mvc.mvc.model.Employee;
import com.example.mvc.mvc.view.EmployeeView;

import java.time.LocalDate;

public class MvcApplication {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "John Doe", "Jr. Associate", LocalDate.of(2000, 01, 01));
		EmployeeView employeeView = new EmployeeView();

		EmployeeController employeeController = new EmployeeController(employee, employeeView);
		employeeController.updateView();

		// update model data
		employeeController.setName("Jane Doe");
		employeeController.updateView();
	}

}
