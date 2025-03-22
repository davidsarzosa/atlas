package com.neotech.lesson15;

public class Calculator {

	// this class will have 3 methods : add, multiply, and divide

	void add(int a, int b) {
		int sum = a + b;

		System.out.println(sum);
	}

	// multiplication

	void multiply(int a, int b) {
		System.out.println(a * b);
	}

	// divide two numbers

	void division(double a, double b) {
		double result = a / b;

		System.out.println("The division of number " + a + "and number " + b + "is" + result);

	}

}
