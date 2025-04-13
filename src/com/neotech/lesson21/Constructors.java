package com.neotech.lesson21;

import java.lang.reflect.Constructor;

public class Constructors {

	// default object creating flow
	// --> when we say new Constructors() --> calls the default constructor

	Constructors() {
		System.out.println("Hello from Default Constructor ");

	}

	// 2nd Constructor
	Constructors(int x) {
		this(5, 10, 15);
		System.out.println("Hello from the 2nd Constructor ");

	}

	// 3rd Cconstructor

	Constructors(int x, int y) {
		System.out.println("Hello from the 3rd Constructor ");
	}

	// 4rd Constructor

	Constructors(int a, int b, int c) {

		System.out.println("Hello from the 4rd Constructor ");
	}

	public static void main(String[] args) {

		// Constructors cs1 = new Constructors();
		// Constructors cs2 = new Constructors(5);
		Constructors cs3 = new Constructors(4);

		// this keyword will understand based on the parameters you are passing
		// you wan to call a different constructor within the constructor
		// you actually are calling

	}
}
