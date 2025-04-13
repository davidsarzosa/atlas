package com.neotech.lesson23;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.salary = 1000;
		emp.getPaid();

		System.out.println("----------------------");

		Contractor c = new Contractor();

		c.hourlyRate = 50.5;
		c.getPaid();
		System.out.println("----------------------");

		FullTimeEmployee fte = new FullTimeEmployee();
		fte.salary = 15000;
		fte.getPaid();

	}

}
