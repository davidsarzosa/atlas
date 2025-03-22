package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {

		// ClassName identifier
		Car car1 = new Car();
		// Create an object using the Car template and
		// we assign that object to car 1

		car1.make = "TOYOTA";
		car1.model = "SUPRA";
		car1.color = "SILVER";
		car1.miles = 24000;
		car1.year = 2025;

		System.out.println(car1.make + " " + car1.model + " " + car1.color);

		car1.drive();
		car1.stop();
		car1.transportPeople();

		Car car2 = new Car();

		car2.make = "NISSAN";
		car2.model = "MAXIMA";
		car2.color = "BLUE";
		car2.miles = 34000;
		car2.year = 2025;

		System.out.println();
		System.out.println(car2.make + " " + car2.model + " " + car2.color);
		car2.drive();
		car2.stop();
		car2.transportPeople();

		Car car3 = new Car();

		Car car4;

	}

}
