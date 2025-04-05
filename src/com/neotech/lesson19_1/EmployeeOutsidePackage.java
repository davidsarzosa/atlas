package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {

	public static void main(String[] args) {

		Employee.company = "Atlas";

		Employee emp = new Employee();
		emp.name = "Consuelo";
//		emp.lastName = "Moya"; // protected can not have access
//		emp.salary = 124000; // is default so we cannot see it from here
//		emp.ssn = 1234; // is private so we can only see it from the same class

		emp.method1(); // accessible because is public
		// these methods exist, but they cannot be accessed from here
		// emp.method2();
		// emp.method3();
		// emp.method4();

		// emp.method5(); this is a completely different problem, this methods is
		// undefined

	}

}
