package com.neotech.lesson19;

public class RecapEmployeeWithPackage {
	// THIS RECAP IS FROM CLASS EMPLOYEE WITH PACKAGE

	public static void main(String[] args) {

		Employee.company = "Atalss";
		Employee emp1 = new Employee();
		emp1.name = "Adrian";
		emp1.lastName = "Espinosa";
		emp1.salary = 15.000;
		// emp1.ssn = 1234455; // Private access modifier

		// method for Comapany

		emp1.method1();
		emp1.method2();
		emp1.method3();

		Recap.Company = "Equinoccio";
		Recap emp2 = new Recap();
		System.out.println(emp2.name); // value = null !!!
		emp2.name = "Paola";
		System.out.println(emp2.name); // you give value Paola!
		emp2.lastName = "Sarzosa";
		emp2.salary = 15.000;
		// emp1.ssn = 1234455; // Private access modifier

		// Methods for Recap

		emp2.method1();
		// emp2.method2(); // this is not visible
		emp2.method3();
		emp2.method4();

	}

}
