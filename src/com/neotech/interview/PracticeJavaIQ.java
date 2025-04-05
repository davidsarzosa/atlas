package com.neotech.interview;

public class PracticeJavaIQ {

	public static void main(String[] args) {

//		// 1. Write a program to swap 2 numbers without a temporary variable?
//		// 2. Swap 2strings without a temporary variable?
//
		int a = 10;
		int b = 5;
		System.out.println(a + " " + b);

		a = a + b; // a = 15
		b = a - b; // b = 10
		a = a - b; //
		System.out.println(a + " " + b);

		// now we will do the same with a String

		String str1 = "Austin";
		String str2 = "Texas";

		System.out.println(str1 + " " + str2);
		str1 = str1 + str2; // AustinTexas
		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println(str1 + " " + str2);
		str1 = str1.substring(str2.length());
		System.out.println(str1 + " " + str2);

		// Write a java program to check whether a given number is prime or not?
		// number 1 is not prime, Prime number is a number that is greater than 1
		// prime number is divisible only by 1 and itself

		int number = 4523;
		boolean prime = true;

		if (number == 1) {
			prime = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.println(number + " is divisible by " + i);
					prime = false;
					break;

				} else {
					System.out.println(number + " is NOT divisible by " + i);
				}
			}
		}

		System.out.println("----------------------");
		System.out.println(number + " Is Prime ? " + prime);
	}

}
