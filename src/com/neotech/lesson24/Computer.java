package com.neotech.lesson24;

public class Computer {

	/*
	 * TASK
	 * 
	 * Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, and
	 * Dell.
	 * 
	 * ➔ Define some common behavior (methods) and some fields in the parent class,
	 * and override some of the
	 * 
	 * methods in the child classes.
	 * 
	 * ➔ Define some methods specific to the child classes.
	 * 
	 * ➔ Create objects of the child classes and store them in an array.
	 * 
	 * ➔ Loop through each object and execute available methods.
	 * 
	 */

	int cost;
	String model;

	public void starts() {
		System.out.println("The computer starts! ");
	}

	public void displayInfo(int cost, String model) {
		this.cost = cost;
		this.model = model;
		System.out.println("This is a " + model + "computer " + "and cost " + cost);

	}

}

class Apple extends Computer {

	public void starts() {
		System.out.println("Apple laptop starts! ");
	}

	public void architecture() {
		System.out.println("Apple is the best for architecture ");
	}

	public void displayInfo(int cost, String model) {
		this.cost = cost;
		this.model = model;

		System.out.println("This is a " + model + "computer " + "and cost " + cost);
	}
}

class Lenovo extends Computer {

	public void starts() {
		System.out.println("Apple laptop starts! ");
	}

	public void batteryLife() {
		System.out.println("Levono has the best battery life! ");
	}

	public void displayInfo(int cost, String model) {
		this.cost = cost;
		this.model = model;

		System.out.println("This is a " + model + "computer " + "and cost " + cost);

	}
}

class HP extends Computer {

	public void starts() {
		System.out.println("Apple laptop starts! ");
	}

	public void displayInfo(int cost, String model) {
		this.cost = cost;
		this.model = model;

		System.out.println("This is a " + model + "computer " + "and cost " + cost);
	}

	public void speakers() {
		System.out.println("Lenovo has the best speakers ");
	}

}

class Dell extends Computer {

	public void starts() {
		System.out.println("Dell laptop starts! ");
	}

	public void durability() {
		System.out.println("Dell computer has a really good durability ");
	}

	public void displayInfo(int cost, String model) {
		this.model = model;
		this.cost = cost;
		System.out.println("This is a " + model +  "and cost " + cost);

	}

}
