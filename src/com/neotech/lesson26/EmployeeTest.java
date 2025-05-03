package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {

		// Because the variables are private
		// I cannot access them directly here

		Employee emp = new Employee();
		// emp.salary = 6543.25;
		// emp.age = 25;
		// emp.name = "Adrian";

		// If you want to set values, you need to use a setter.
		// If you want to get values, you need to use a getter.

		emp.setAge(25);
		emp.setName("David Sarzosa");
		emp.setSalary(6542.45);

		System.out.println(emp.getAge());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

}
