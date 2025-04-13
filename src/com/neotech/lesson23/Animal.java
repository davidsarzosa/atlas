package com.neotech.lesson23;

public class Animal {

	public void eat() {
		System.out.println("All animals eat! ");
	}

	public void sleep() {
		System.out.println("All animals sleep! ");
	}

	// Compile time Polymorphisim -- method overloading
	// public void sleep(String str) {

}

class Tiger extends Animal {

	// overriding
	public void eat() {
		System.out.println("Tigger eats humans! ");
	}

	public void run() {
		System.out.println("Tiger runs really fast! ");
	}

}
