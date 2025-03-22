package com.neotech.lesson15;

public class CalculatorWithReturn {

	// add two numbers

	int add(int a, int b) {
		return a + b;

	}

	int multiply(int a, int b) {
		return a * b;

	}

	double divide(double a, double b) {
		return a / b;
	}

	int giveMeSomething() {
		return 10;
	}

	void giveMeNothing() {
		System.out.println("Nothing is sent ");
	}

	// Create a method that gets 3 doubles and returns their average

	double average(double a, double b, double c) {
		return (a + b + c) / 3;

	}

	// Create a method that receives and integer but returns a string

	String returnToString(int a) {
		return ("your number is " + a);

	}

}
