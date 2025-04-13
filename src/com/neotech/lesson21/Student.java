package com.neotech.lesson21;

public class Student {

	// Write program as a Student class that has instance variables name and
	// address.
	// Create a constructor that will initialize those variables.
	// Print name & address of given student using displayInfo method.

	String name, adress;
	int age;

	// this is the same as the default constructor java uses
	// It does nothing
	Student() {

	}

	// this constructor takes two parameters and assigns
	// the values to the instance variables

	Student(String name) {
		this.name = name;
	}

	Student(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	Student(String name, int age, String adress) {
		this.name = name;
		this.age = age;
		this.adress = adress;

	}

	public void displayInfo() {
		// using this her this not mandatory, because I only have one name variable
		// (instance) but it is a good practice to use it, since it shoes that they are
		// instance variables

		System.out.println("Name: " + this.name + " \nAddress: " + this.adress);
	}

	public void displayInfo2() {
		System.out.println("Name: " + this.name + "\nAge: " + age + " \nAddress: " + this.adress);
	}

}
