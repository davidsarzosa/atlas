package com.neotech.lesson13;

public class Task3 {

	// Create a 2D array of integer type and store numbers
	// 3 rows and 3 columns. Print the sum of all numbers

	public static void main(String[] args) {

		int numbers[][] = {

				{ 3, 4, 5, }, { 56, 34, 12 }, { 45, 67, 23, }

		};

		// here is the first option with just an enhanced loop

		int sum = 0;
		for (int[] number : numbers) {
			for (int total : number) {
				sum += total;
			}

		}
		System.out.println("The total amount is " + sum);

		// here is a different way to do it
		// with a each for loop
		int sum2 = 0;
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				sum2 += numbers[row][col];
			}
		}
		System.out.println("The total amount is " + sum2);
		
		// here is going to be a 3 way to do it; 
		// using for each loop 
		
	 

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
