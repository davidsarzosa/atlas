package com.neotech.lesson19;

public class StaticKeyword {

	String color;
	int memory;

	static String brand;
	static boolean touchscreen;

	// instance method: in the instance method
	// I can use static and non static
	// variables

	void displaySpecificInfo() {
		System.out.println("We build a " + brand + " with " + memory + " GB memory and it is " + color);
	}
	// static method: static methods can run directly using the className.
	// so they cannot reference the instance variables. So, we can only use static
	//

	static void displaySpecificInfo_2() {
//		System.out.println("We build " + brand + " with " + memory + " GB memory and it is " + color");
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);

	}

	public static void main(String[] args) {
		// I can access any static member of a class without creating an object
		// That's why, it cannot contain any non-static members
		StaticKeyword.displaySpecificInfo_2();

		// I can also call it without the className in front (because I'am calling it
		// within the same class)
		StaticKeyword.displaySpecificInfo_2();

		// I can change the value of touchscreen
		// i am creating a LOCAL variable
		boolean touchscreen = true;
		StaticKeyword.displaySpecificInfo_2();

		// what about, wwhich one is changing ?
		// LOCAL
		touchscreen = false;

		// So how can I change the static variable ?
		// I will have to specify the static variable using className
		StaticKeyword.touchscreen = true;
		StaticKeyword.displaySpecificInfo_2();

		// i will not have to specify using className If I do not have a local variable
		// with the same name
		brand = "Samsung";

		// Can I call displaySpecificInfo()?
		// NO we cannot, we need to create an object to deal with non static members

		// displaySpecificInfo();

		StaticKeyword iphone1 = new StaticKeyword();
		iphone1.color = "Blue";
		iphone1.memory = 500;

		// Now I can print the instance methods
		iphone1.displaySpecificInfo();
		StaticKeyword.displaySpecificInfo_2();

		// here you are calling the method using an specific object but it not the
		// proper way
		iphone1.displaySpecificInfo_2();

		// this is the proper way
		StaticKeyword.displaySpecificInfo_2();
	}

}
