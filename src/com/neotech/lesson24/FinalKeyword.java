package com.neotech.lesson24;

//if we make this class FINAL it means it cannot be extended from anyone

public class FinalKeyword {

	public static String str = "Hello";

	// this is a final variable!
	public static final String str1 = "Bye";

	public static void main(String[] args) {

		str = "Hi"; // I am reassigning a value!
		// str1 = "GoodBye!"; // Compiler Error

		// local variable
		final String finalStr = "Java is so much fun - Maelito";

		// Can I change finalStr --> NO! I cant
		// finalStr = "Java is not so much fun! ";

	}

	// lets create a final method

	public final void hello() {
		System.out.println("Hello from final method ");
	}

	// Can I overload a final method ? -- YES!
	public final void hello(String str) {
		System.out.println("Hello" + str);
	}

}

class SubClass extends FinalKeyword {

	// lets try overriding the hello()

//	public final void hello() {
//		System.out.println("You cannot override a final method From FinalKeyword");
//	}

	public void hello(int num) {
		System.out.println("This is posible -- different signature -- different method");
	}

//	public void hello(int num) {
//		System.out.println("this is not posible, duplicate meethod! ");
//	}

}
