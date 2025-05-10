package com.neotech.interview;

public class IQ1 {

	// 1. Write a program to swap 2 numbers without a temporary variable?
	// 2. Swap 2strings without a temporary variable?

	//
	public static void main(String[] args) {

		int a = 3;
		int b = 6;

		System.out.println("a = " + a + " b= " + b);

//		// using a temporary variable
//		int temp = b;
//		b = a;
//		a = temp;
//		System.out.println("a = " + a + " b= " + b);

		// here is one whiout using a temporary variable

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a + " b= " + b);

		System.out.println("----------------------------");
		// this will work for any 2 strings!
		String str1 = "Java";
		String str2 = "Selenium";
		System.out.println(str1 + " " + str2);
		str1 = str1 + str2; // JavaSelenium
		str2 = str1.substring(0, str1.length() - str2.length()); // if I hardcode this will work for this but not for
																	// other exercises
		// System.out.println(str1 + " " + str2);
		str1 = str1.substring(str2.length());
		System.out.println(str1 + " " + str2);

	}

}
