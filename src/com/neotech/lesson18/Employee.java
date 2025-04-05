package com.neotech.lesson18;

public class Employee {

	// ▪ Create a Class called Employee:
	// ▪ Create three variables: eID, salary and set the CEO to “Elion”
	// ▪ CEO should be a static variable
	// ▪ Create a method printInfo() that prints out the eID, salary and
	// CEO of the object
	// ▪ Create two objects of the class Employee
	// ▪ Set the value of eID, salary for each of the objects
	// ▪ Call the printInfo() method for both objects
	// ▪ Change the CEO to “Ahmet”
	// ▪ Call the printInfo() method for both objects

	String eID;
	int Salary;
	static String CEO = "David";

	String printInfo() {

		String employeeInfo = "Id number " + eID + " employee Salary is " + Salary + " The CEO is " + CEO;
		return employeeInfo;
	}

	public static void main(String[] args) {

		// Employee.CEO = "Maelito"; you can replace a static variable at the beginning
		// of the code
		Employee employee1 = new Employee();
		employee1.eID = "Jose1996";
		employee1.Salary = 40000;
		System.out.println(employee1.printInfo());

		Employee employee2 = new Employee();
		employee2.eID = "Mario1960";
		employee2.Salary = 80000;
		System.out.println(employee2.printInfo());

	}
}
