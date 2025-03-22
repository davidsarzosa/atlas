package com.neotech.lesson14;

public class Car {

	// What features does a car have ?
	// make model color year miles -- > can be represented with a variable ?

	// what behaviors does a car have ??
	// drive(), stop(): transportPeople(); -- > can be represented with a method ?

	String make;
	String model;
	String color;
	int year;
	double miles;

	// behaviors -- methods
	// input ---->>> transportation --->> output

	void drive() {
		System.out.println(make + " Drives!");
	}

	void transportPeople() {
		System.out.println(make + " Transport people!");

	}

	void stop() {
		System.out.println(make + " Stops!");
	}

	// what is a class?
	// a class is a template/blueprint made out of features and behaviors

	// what is an object
	// an object is an instance/example of a class

	public static void main(String[] args) {

		int a = 5;

		// how do I make use of the template we created ?

		// Date Type identifier = value;
		// ClassName identifier = NEW ClassName();

		Car car1 = new Car(); // I have just created an Object!!
		// what does this line do ?

		// 1. Car car1 ---->>> Declared an object of type Car and names it as car1
		// 2. NEW ---->>>> instantiate
		// 3. Car() --->>> initialize

		// Since the object was created with default values, how
		// do I change those ?

		car1.make = "BMW";
		car1.color = "Blak";
		car1.model = "M5";
		car1.miles = 1500;
		car1.year = 2025;

		// we can reassing values
		car1.color = "Blue";
		car1.miles = 2500;

		System.out.println("I have a " + car1.make + " " + car1.color + " model " + car1.model + " " + car1.year
				+ " with " + car1.miles + " miles");

		// how do we access the methods ?

		car1.drive();
		car1.stop();
		car1.transportPeople();

	}

}
