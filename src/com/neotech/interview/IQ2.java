package com.neotech.interview;

public class IQ2 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?
		// number 1 is not prime, Prime number is a number that is greater than 1
		// prime number is divisible only by 1 and itself

		int number = 73243; // Not prime because this is divisible by 1, 3, 5, 7
		boolean prime = true;

		if (number == 1) {
			prime = false;
		} else {

			for (int i = 2; i < number; i++) { // i < number / 2 // i * i <= number 

				if (number % i == 0) {
					System.out.println(number + " is divisible by " + i);
					prime = false;
					break;
				} else {
					System.out.println(number + " is NOT divisible by " + i);
				}
			}

		}
		System.out.println("-----------------------------------------------");
		System.out.println(number + " is prime ? " + prime);

	}

}
