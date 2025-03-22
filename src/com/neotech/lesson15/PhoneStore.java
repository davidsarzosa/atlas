package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		// Instantiation (Create) an object from the class

		Phone iphone = new Phone();

		iphone.brand = "Iphone";
		iphone.color = "Black";
		iphone.model = "16 Pro Max";
		iphone.price = 1250;

		System.out.println("It is a " + iphone.brand + " model " + iphone.model + " color is " + iphone.color
				+ " and cost " + iphone.price);

		iphone.call();
		iphone.text();
		iphone.navigate();

		System.out.println();
		// instantiation (create ) an object from the class

		Phone samsung = new Phone();

		samsung.brand = "Samsung";
		samsung.color = "White";
		samsung.model = "Galaxy S22 Ultra";
		samsung.price = 1300;

		System.out.println("It is a " + samsung.brand + " model " + samsung.model + " color is " + samsung.color
				+ " and cost " + samsung.price);

		samsung.text();
		samsung.call();
		samsung.navigate();

		System.out.println();
		// instantiation (create) an object from the class

		Phone nokia = new Phone();

		nokia.brand = "Nokia";
		nokia.color = "Blue";
		nokia.model = "1100";
		nokia.price = 100;

		System.out.println("It is a " + nokia.brand + " model " + nokia.model + " color is " + nokia.color + " and cost "
				+ nokia.price);

		nokia.text();
		nokia.call();
		nokia.navigate();

	}

}
