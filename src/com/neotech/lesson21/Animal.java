package com.neotech.lesson21;

public class Animal {

	// some attributes
	String name, color;
	int age, weight;

	// lets create some behaviors

	public void eat() {
		System.out.println("All animals eats! ");
	}

	public void sleep() {
		System.out.println("All animals sleep! ");
	}

	public void displayInfo() {
		System.out.println("Name " + name + " Color " + color + " Age " + age + " Weight " + weight);
	}

}
