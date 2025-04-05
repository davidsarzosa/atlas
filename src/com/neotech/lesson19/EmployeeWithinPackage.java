package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {

		Employee.company = "Neotech";

		Employee emp = new Employee();

		emp.name = "Alejandro";
		emp.lastName = "Cano";
		emp.salary = 45.000;
		// emp.ssn = "1234";

		// this does not exist in the class employee can exist ? yes you can created if
		// you want
		// emp.phoneNumber = "";

		// for variables -- > within the same pachage we can see all, EXCEPT private
		// elements,

		// can we access the methods ?

		emp.method1();
		emp.method2();
		emp.method3();
		// emp.method4(); // method is not visible because if private

		// emp.method5(); // this method does not exist

	}

}
