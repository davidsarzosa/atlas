package com.neotech.lesson13;


public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */

		int numbers[][] = {

				{ 1, 3, 5, 7, }, { 11, 13, 15, 17, }, { 6, 8, 10, 12, } };

		int sumEven = 0;
		for (int[] evenrow : numbers) {
			for (int num : evenrow) {
				if (num % 2 == 0) {
					System.out.print(num + " ");
					sumEven += num;

				}
			}

		}

		System.out.println();
		System.out.println("Total of even numbers is " + sumEven);
		// System.out.println("The sum of even numbers is " + );
	}

}
