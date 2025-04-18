package com.neotech.lesson24;

public class FinalExamples {

	/*
	 * Create a class FinalExamples that has one final String variable with an
	 * initial value and one final method printVariable().
	 * 
	 * In the main method create an object of FinalExamples class and try to
	 * reassign a value to instance variable.
	 * 
	 * Create a sub class of FinalExamples named ChildClass and try to override the
	 * printVariable() method.
	 * 
	 */

	final String str = "I love Java";

	final void printVariable() {
		System.out.println("Serius! " + str);
	}

	public static void main(String[] args) {
		FinalExamples fe = new FinalExamples();
		// fe.str = "I don't like Java"; we cannot do this

	}

}

class childClass extends FinalExamples {

	// NOT POSSIBLLE TO OVERRIDE A FINAL METHOD
//	final void printVariable() {
//		System.out.println("Serius! "); 
//	}

}
