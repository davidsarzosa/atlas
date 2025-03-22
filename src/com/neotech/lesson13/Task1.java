package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integer type with 3 rows and 4 columns and print all
		 * values of the whole array.
		 */
		// for each loop // enhanced for loop 
		int[][] numbers = { { 2, 4, 6, 3, 5 }, { 5, 4, 2, 1, }, { 4, 5, 7, 2, } };

		for (int row[] : numbers) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------------");

		// Do I need the a NESTED FOR LOOP to print the first row ?

		for (int i = 0; i < numbers[0].length; i++) {
			System.out.print(numbers[0][i] + " ");

		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();

		// Do I need a Nested for loop to print just the first column ?

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}

		// for each loop

	}

}
