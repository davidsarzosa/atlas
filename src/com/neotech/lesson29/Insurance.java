package com.neotech.lesson29;

public abstract class Insurance {

	/*
	 * Homework 3: Create a class Insurance that will have an attribute as
	 * insuranceName and unimplemented behaviour as getQuote() and
	 * cancelInsurance(). Create 3 subclasses Car, Pet, Health. Car class has its
	 * own attribute as carModel and Class Pet has petType attribute. Create 3
	 * objects of the sub classes and store them in ArrayList. Using for
	 * loop/advanced for loop/iterator access all methods of the class.
	 */

	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;

	}

	abstract void getQuote();

	abstract void cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;

		System.out.println("Car model " + carModel + " insurance " + insuranceName);
	}

	@Override
	void getQuote() {
		System.out.println("Quote for " + insuranceName + " 650$!");
	}

	@Override
	void cancelInsurance() {
		System.out.println("I want to cancel this " + insuranceName + " don't call me anymore ");
	}

}

class Pet extends Insurance {

	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
		System.out.println("We have a " + petType + " he has " + insuranceName);
	}

	@Override
	void getQuote() {
		System.out.println(petType + " is 300 a yer");
	}

	@Override
	void cancelInsurance() {
		System.out.println("I want to cancel " + insuranceName + ", " + petType + " is dead ");
	}

}

class Health extends Insurance {

	String issuer;

	public Health(String insuranceName, String issuer) {
		super(insuranceName);
		this.issuer = issuer;
		System.out.println("Health Insurance " + insuranceName + "Issuer " + issuer);
	}

	@Override
	void getQuote() {
		System.out.println(issuer + " is chargind 500 a year ");
	}

	@Override
	void cancelInsurance() {
		System.out.println("I want to cancel " + insuranceName + " and I will sue " + issuer);
	}

}
