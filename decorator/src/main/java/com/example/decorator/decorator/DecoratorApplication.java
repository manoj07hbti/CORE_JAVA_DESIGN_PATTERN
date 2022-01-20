package com.example.decorator.decorator;

import com.example.decorator.decorator.model.DepartmentDecorator;
import com.example.decorator.decorator.model.HumanResource;
import com.example.decorator.decorator.model.IndiaDepartmentDecorator;
import com.example.decorator.decorator.model.Sales;
import com.example.decorator.decorator.repo.Department;

public class DecoratorApplication {

	public static void main(String[] args) {
		Department sales = new Sales();
		Department hr = new HumanResource();
		Department indiaSales = new IndiaDepartmentDecorator(sales);
		Department indiaHr = new IndiaDepartmentDecorator(hr);

		System.out.println("Global Sales Contact: " + sales.getEmail());
		System.out.println("Indian Sales Contact: " + indiaSales.getEmail());
		System.out.println("Global HR Contact: " + hr.getEmail());
		System.out.println("Indian HR Contact: " + indiaHr.getEmail());

		/**
		 * Global Sales Contact: sales@example.com
		 * Indian Sales Contact: india.sales@example.com
		 * Global HR Contact: hr@example.com
		 * Indian HR Contact: india.hr@example.com
		 */
	}

}
