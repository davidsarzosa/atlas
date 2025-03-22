package com.neotech.lesson15;

public class Task {

	/*
	 * method1: Create a method that will take 2 parameters as numbers and prints
	 * which number is larger.
	 * 
	 * method2: Create a method that will take a number and prints whether the
	 * number is even or odd.
	 * 
	 * method3: Create a method that will say Hello in a different language based on
	 * the country that will passed when method is executed.
	 */

	// this is method 1 with a switch case
	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (b > a) {
			System.out.println(b + " is larger than " + a);
		} else {
			System.out.println("the numbers are equal ");
		}
	}
	// This will be for Method 3

	void SayHello(String country) {

		switch (country) {
		case "USA":
		case "UK":
			System.out.println("Hello");
			break;
		case "Mexico":
		case "Spain":
		case "Ecuador":
		case "Bolivia":
			System.out.println("Hola");
			break;

		case "Turkye":
			System.out.println("Mereba");
			break;

		case "Philipins": {
			System.out.println("Tao");
		}
			break;
		default: {
			System.out.println("I do not know how to say hello in " + country);
		}

		}
	}

	void evenOrodd(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is Odd");
		}

	}

	public static void main(String[] args) {
		
		
		Task task = new Task();
		
		task.larger(34, 78);
		task.larger(385, 534);
		
		task.evenOrodd(583);
		task.evenOrodd(4654);
		
		task.SayHello("Argentina");
		task.SayHello("USA");
		task.SayHello("Canada");
		task.SayHello("Ecuador");
		task.SayHello("Turkye");
		
		
		
		
		
		
		
		

	}

}
