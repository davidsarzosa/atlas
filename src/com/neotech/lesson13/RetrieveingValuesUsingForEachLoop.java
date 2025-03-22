package com.neotech.lesson13;

public class RetrieveingValuesUsingForEachLoop {

	public static void main(String[] args) {

		String[][] animals = { { "cat", "lion", "chita", }, { "wolf", "condor", "shark", },
				{ "jiraf", "tiger", "dog", } };

		// initialization, condition, increment

		for (int row = 0; row < animals.length; row++) {
			for (int col = 0; col < animals[row].length; col++) {

				System.out.println(animals[row][col]);
			}
			System.out.println();
		}

		System.out.println("---------------------------------");
		// this will be using for each loop, or enhanced loop or / fancy loop

		for (String[] row : animals) {
			for (String col : row) {
				System.out.println(col);
			}
			System.out.println();
		}

	}

}
