package com.neotech.lesson25;

public abstract class Vehicle {

	String color;

	public Vehicle(String color) {
		this.color = color;

	}

	public void drive() {
		System.out.println("Vehicle drives ");
	}

	public void stop() {
		System.out.println("Vehicle stops! ");
	}

	public abstract void start();

	public abstract void brake();

}

abstract class Car extends Vehicle {

	String carType; // this is just an attribute to the local Object Car

	public Car(String color, String carType) {
		super(color);
		this.carType = carType;

	}

	@Override
	public void brake() {
		System.out.println(carType + " has no breakes ");
	}

	public abstract void carDetails();

}

class Tesla extends Car {

	Tesla(String color, String carType) {
		super(color, carType);

	}

	@Override
	public void carDetails() {
		System.out.println("Details  " + color + " " + carType);
	}

	@Override
	public void start() {
		System.out.println(carType + " starts remotly ");
	}

	public void display() {
		System.out.println("We have a " + color + " " + carType);
	}

}

class Toyota extends Car {

	Toyota(String color, String carType) {
		super(color, carType);

	}

	@Override
	public void start() {
		System.out.println("");
	}

	@Override
	public void brake() {
		System.out.println("");
	}

	@Override
	public void carDetails() {
		System.out.println("");
	}

}
