package com.neotech.lesson10;

public class homework2 {
	public static void main(String[] args) {

		// Print numbers from 1 to 50 except those that are divisible by 3.

		// for any loop we need to define:
		// starting point
		// ending point
		// increment (variable change)

		// using while loop

		int i = 1;
		while (i <= 50) {
			if (i % 3 == 0) {
				i++;
				continue;

			} else {
				System.out.println(i + " ");
			}
			i++;

		}

		// do while
		int a = 1;
		do {
			if (i % 3 == 0) {
				a++; // isolated increment, only executes if the condition is true
				continue;
			}
			System.out.println(a + " ");
			a++;

		} while (a <= 50);
		System.out.println();

		// for loop

		for (int j = 1; j <= 50; j++) {

			if (j % 3 == 0) {
				continue;
			}
			System.out.println(j + " ");
		}

	}
}
