package com.neotech.lesson23;

public class Employee {

	double salary; // this is a variable or attribute

	void getPaid() {
		System.out.println("The employee salary is " + salary);
	}

}

class Contractor extends Employee {

	double hourlyRate; // this attribute only belongs to this class

	void getPaid() { // this is an override method
		System.out.println("The contractor hourly rate is " + hourlyRate);
	}

}

class FullTimeEmployee extends Employee {
	
}
