package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {

		// Print Good morning 5 times
		// we will handle the code repetition using loops
		// what we need:

		for (int i = 1; i <= 5; i++) {

			System.out.println("Good Morning ! !  ");

			System.out.println();

			// This will be as well using while or do while.

		}

		System.out.println("==============================");

		// using dowhile

		int i = 1;
		int count = 0;
		do {
			System.out.println("good morning!  ");
			i++;
			System.out.println();
		} while (i <= 5);
		{
			count += i;

		}

		System.out.println();

	}

}
