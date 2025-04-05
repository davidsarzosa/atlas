package com.neotech.lesson17;

public class justForFun {

	// This is a method with no parameters and NO return type
	// void, does not need return type, meaning we do not have to use primitive
	// DataType

	void result() {
		String resultString = "Today";
		int resultInt = 4 + 4;
		double resultDouble = 3.4 + 3.9;

	}

	// TWO parameters and NO return type, ("void" does not need to provide DataType

	void result2(int a, int b) {
		int result = a + b;
	}

	// No parameters With a return Type,
	// when we promise to give a return type then we need a primitive DataType

	int result3() {
		int a = 5;
		int b = 6;
		int result = a + b;
		return result;
	}

	String result3String() {
		String firstName = "Maelito";
		String lastName = "Campeon";

		String fullName = firstName + lastName;

		return fullName;

	}

	// TWO parameters and WITH return type

	int thoParametersTwoReturn(int a, int b, int c) {

		int total = a + b - c;

		return total;
	}

	String thoParametersStrings(String firstName, String lastName, String midleName) {

		String fullName = "Your full name is " + firstName + lastName + midleName;

		return fullName;
	}

	public static void main(String[] args) {

		// to use the methods we need to create an object, we need to call the class
		justForFun delta1 = new justForFun();

		// now inside the class we can call the methods and pass the parameters
		System.out.println(delta1.thoParametersTwoReturn(4, 6, 8));
		System.out.println(delta1.thoParametersStrings("David ", "Alejandro ", "Sarzosa"));

		// inside the main method you can call methods but first you need to create an
		// object who will
		// utilize those methods, you can have as many objects as you want.

		String nameImput = delta1.thoParametersStrings("David ", "Alejandro ", "Sarzosa");

		if (nameImput.contains("David Alejandro Sarzosa")) {
			System.out.println("You are correct this is my name ");
		} else {
			System.out.println("You are not even close");
		}
		System.out.println("--------------------------");

		int result3 = delta1.result3();

		if (result3 == 11) {
			System.out.println("You got this! ");
		} else {
			System.out.println("Try it again");
		}

		System.out.println("--------------------------");

		int result4 = delta1.thoParametersTwoReturn(23, 34, 195);

		if (result4 == 56)
			System.out.println("Yay! the result is 56");
		else
			System.out.println("no, the result is: " + result4);

		System.out.println("--------------------------");

	}

}
