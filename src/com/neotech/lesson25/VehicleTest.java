package com.neotech.lesson25;

public class VehicleTest {

	public static void main(String[] args) {

		// we CAN NOT instantiate from an abstract class
		// Vehicle v1 = new Tesla("Red"); // This is not possible because of Vehicle
		// class is an abstract class

		// Car car1 = new Car("Red","Honda"); // This is also an abstract class so is
		// not possible initiate it as an Object

		Vehicle v1 = new Tesla("Black", "Cybertruck");
		v1.drive();
		v1.start();
		v1.brake();
		v1.stop();

		// v1.display(); - display() does not exist in Vehicle class

		// down - casting the object from Vehicle to Tesla
		Tesla t1 = (Tesla) v1;
		t1.display();

		Toyota toyota1 = new Toyota("Silver", "Supra");
		Car toyota2 = new Toyota("Grey", "Highlander"); // up-casting
		Vehicle toyota3 = new Toyota("Blue", "Celica"); // up-casting

		toyota1.start();
		toyota2.start();
		toyota3.start();

		Tesla tesla1 = new Tesla("White", "Y");
		Vehicle tesla2 = new Tesla("Red", "3"); // up - casting

		tesla1.display();
		// tesla2.display(); 
		// Vehicle has not this method implementation there

	}

}
