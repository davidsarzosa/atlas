package com.neotech.lesson23;

public class Programing {

	/*
	 * Create a class named 'Programming'. While creating an object of the class, if
	 * nothing is passed to it, then the message "I love programming languages"
	 * should be printed. If some String is passed to it, then in place of
	 * "programming languages" the value variable should be printed. Example, if we
	 * pass "Java", then "I love Java" should be printed.
	 * 
	 */

	// Even if i do not create a constructor, the default constructor is executed.
	// By creating constructors we get to have a say on how the object is created.

	Programing() { // this is a default constructor that it's being called whenever we execute the maind method
		// Java know I'm calling it because there is not arguments. 
		System.out.println("I love programming languages");

	}

	Programing(String str) { // This is a method that has parameters and Java knows it. 
		// when creating the object and passing the arguments Java will executed the constructor 
		// that is matching the constructor signature. 
		System.out.println("I love " + str + "!");
	}

	public static void main(String[] args) {

		Programing p1 = new Programing();
		Programing p2 = new Programing("JAVA");
		
		

	}
}
