package com.example.factory.factory;

import com.example.factory.factory.factory.DepartmentFactory;
import com.example.factory.factory.repo.Department;

public class FactoryApplication {
	public static void main(String[] args) {
		DepartmentFactory factory = new DepartmentFactory();

		printDepartment(factory, "admin");
		printDepartment(factory, "hr");
		printDepartment(factory, "sales");

		/**
		 * Department contact: admin@example.com, class name: com.example.factory.factory.model.Administration
		 * Department contact: hr@example.com, class name: com.example.factory.factory.model.HumanResource
		 * Department contact: sales@example.com, class name: com.example.factory.factory.model.Sales
		 */
	}

	private static void printDepartment(DepartmentFactory factory, String departmentName) {
		Department department = factory.getDepartment(departmentName);
		System.out.println(String.format("Department contact: %s, class name: %s", department.getEmail(), department.getClass().getName()));
	}
}
