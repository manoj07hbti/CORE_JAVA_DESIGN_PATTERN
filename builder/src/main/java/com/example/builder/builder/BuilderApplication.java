package com.example.builder.builder;

import com.example.builder.builder.model.Employee;

import java.time.LocalDate;

public class BuilderApplication {

	public static void main(String[] args) {
		Employee johnDoe = Employee.EmployeeBuilder
				.newBuilder()
				.setId(101)
				.setName("John Doe")
				.setBand("Jr. Associate")
				.setDateOfJoining(LocalDate.of(2000, 01, 01))
				.build();
		System.out.println("John Doe: " + johnDoe.toString());

		Employee janeDoe = Employee.EmployeeBuilder
				.newBuilder()
				.setId(102)
				.setName("Jane Doe")
				.setBand("Sr. Associate")
				.setDateOfJoining(LocalDate.of(2010, 10, 01))
				.build();
		System.out.println("Jane Doe: " + janeDoe.toString());

		/**
		 * John Doe: Employee{id=101, name='John Doe', band='Jr. Associate', dateOfJoining=2000-01-01}
		 * Jane Doe: Employee{id=102, name='Jane Doe', band='Sr. Associate', dateOfJoining=2010-10-01}
		 */
	}

}
