package com.neotech.lesson15;

public class Phone {

	// Create a Class "Phone". Create 3 Objects of it:
	// iPhone, Android, Nokia with specific attributes and behaviors.

	// attributes / properties
	String color;
	String brand;
	String model;
	int price;

	// behaviors
	// call, text, navigate

	void call() {
		System.out.println(brand + " can make  calls");

	}

	void text() {
		System.out.println(brand + " can text messages");
	}

	void navigate() {
		System.out.println(brand + " can be use as a GPS ");
	}

}
