package com.neotech.lesson14;

public class Dog {

	// Create a class Dog
	// features: bread, size, color, age
	// behaviors: eat(), run() bread()

	// Create a class Shelter
	// Create 3 objects of class Dog and initialize the values for each

	String breed, size, color;
	int age;

	void eat() {
		System.out.println(breed + " eats! ");
	}

	void run() {
		System.out.println(breed + " runs! ");
	}

	void bread() {
		System.out.println(breed + " breeds!");
	}

}
