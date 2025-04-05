package com.neotech.lesson18;

public class Dog {

	// instance variables
	String name;
	int age;

	// lets create some static variables
	static String breed = "Husky";
	static int pounds  = 4;

	void displayDogInfo() {
		System.out.println("The dog name is " + name + " age is "+ age + " breed " + breed + " weigth is " + pounds );
	}

}
