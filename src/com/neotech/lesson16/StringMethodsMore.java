package com.neotech.lesson16;

public class StringMethodsMore {

	public static void main(String[] args) {

		String name = "Mario";

		char letter = name.charAt(0);
		System.out.println("First letter is : " + letter);

		System.out.println("---------------------");

		// IndexOf() and lastIndexOF();

		int index = name.indexOf('W');
		System.out.println(index);
		System.out.println("---------------------");

		// what does it return if the letter is not on the String ?
		System.out.println("The letter with index W is: " + index);
		System.out.println("---------------------");

		String name1 = "Dennis";
		System.out.println("The index of i is " + name1.indexOf('i'));
		System.out.println("---------------------");

		// same way, I could look for a String (not a letter)
		System.out.println("The index of ab is " + name1.indexOf("is"));
		System.out.println("---------------------");

		String message = "Today is raining";
		String subStr = message.substring(9);
		// This only takes 1 parameter : starting index.
		// Then ir returns the string fro the starting index to the end of the string
		System.out.println(subStr);
		System.out.println("---------------------");

		String subStr2 = message.substring(0, 8);
		System.out.println(subStr2);
		System.out.println("---------------------");

		// How can I get today from this String ?

		String subStr3 = message.substring(0, 5);
		System.out.println(subStr3);

	}

}
