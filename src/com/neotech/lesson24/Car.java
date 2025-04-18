package com.neotech.lesson24;

public class Car {

	String brand;
	int year;

	Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
		System.out.println(brand + " it's available for clientes in Provo UT! for models " + year);

	}

	public void testDrive() {
		System.out.println(brand + " do a test drive for clientes");
	}

	public void displayInfo() {
		System.out.println(brand + " " + year + " is available for customers");
	}

}

class bmw extends Car {
	bmw(String brand, int year) {
		super(brand, year);

	}

	@Override
	public void testDrive() {
		System.out.println(brand + " do a test drive for clientes just when they will buy the car ");
	}

	public void speeds() {
		System.out.println(brand + " It's a really fast car ");
	}

	public void displayInfo() {
		System.out.println(brand + " " + " is available for customers since January for models  " + year);
	}

}

class toyota extends Car {

	toyota(String brand, int year) {
		super(brand, year);

	}

	public void testDrive() {
		System.out.println(brand + " do a test drive for clientes only on Thursdays ");
	}

	public void speeds() {
		System.out.println(" Most of " + brand + " are not very fast cars ");
	}

	public void quality() {
		System.out.println(brand + " is known for having the best quailiy in the market ");
	}

	public void displayInfo() {
		System.out.println(brand + " " + " is available for customers since May for models  " + year);
	}

}

class tesla extends Car {
	tesla(String brand, int year) {
		super(brand, year);

	}

	public void testDrive() {
		System.out.println(brand + " do a test drive for clientes every day ");
	}

	public void electricCar() {
		System.out.println(brand + " is the best electric car in the US for the momment ");
	}

	public void displayInfo() {
		System.out.println(brand + " " + " is available for customers since June for models " + year);
	}

}

class chery extends Car {
	chery(String brand, int year) {
		super(brand, year);

	}

	public void testDrive() {
		System.out.println(brand + " do NOT do a test drive in US because they do not have cars ");
	}

	public void displayInfo() {
		System.out.println(brand + " " + " is available for customers since December for models  " + year);
	}

}
