package com.neotech.lesson20;

public class ThisKeyword {

	int a, b;

	ThisKeyword() {

	}

	ThisKeyword(int a, int b) {
		// I want to assign the values of my instance variables
		// Using the constructors parameters
		// but they both share the same name, so I have to differentiate them from each
		// other
		// this keyword makes sure that it points to the instance variables

		this.a = a;
		this.b = b;
	}

	void sum(int a, int b) {
		System.out.println("sum of local variables: " + (a + b));
		System.out.println("Sum of instance variables " + (this.a + this.b));
	}

}
