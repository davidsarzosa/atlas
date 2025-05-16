package com.neotech.interview;

public class Practice {

	public static void main(String[] args) {

		// swap 2 numbers without using a temporal variable

		int a = 5;
		int b = 10;

		System.out.println("a = " + a + " b = " + b);

		b = b + a; // b 15
		a = b - a; // a 10
		b = b - a; //
		System.out.println("a = " + a + " b = " + b);

		// now you have to do the same with a string
		// for strings

		System.out.println();
		String str1 = "Java";
		String str2 = "Selenium";
		System.out.println("Str1 = " + str1 + " Str2 = " + str2);
		str1 = str1 + str2;
		System.out.println("Str1 = " + str1 + " Str2 = " + str2);
		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println("Str1 = " + str1 + " Str2 = " + str2);
		str1 = str1.substring(str2.length());
		System.out.println("Str1 = " + str1 + " Str2 = " + str2);

		// str1 = str1.substring(str2.length() - str.length());

	}

}
