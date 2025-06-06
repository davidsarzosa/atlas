package com.neotech.lesson13;

public class RetrivingValuesFrom2DArrays {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February", }, { "March", "April", "May", },
				{ "June", "July", "August", }, { "September", "October", "November" } };

		// the array months has two dimentions: [4][3]
		int rows = months.length; // returns all the rows in the array -->
		System.out.println(rows);

		int cols = months[1].length;
		System.out.println(cols);

		System.out.println("====================================================");
		// for every element I need two indices - [][]

		for (int row = 0; row < rows; row++) {
			// System.out.print(row);
			for (int col = 0; col < cols; col++) {
				System.out.println(months[row][col] + " ");
			}

		}
		System.out.println();

		System.out.println("====================================================");

		int[][] numbers = { { 1, 3, 4, 6 }, { 4, 6, 7, 17, 8, 9, 3 }, { 10 }, { 11, 12 } };

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}

		}
		System.out.println();

	}

}
