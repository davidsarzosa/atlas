package com.neotech.lesson13;

public class chatGptExamples {

	public static void main(String[] args) {

		// Sum of odd and Even Numbers Separately

		int numbers[][] = { { 23, 34, 45 }, { 45, 34, 23 }, { 67, 45, 23 } };

		int sumEven = 0, sumOdd = 0;

		for (int[] row : numbers) {
			for (int num : row) {

				if (num % 2 == 0)

				{
					sumEven += num;
				} else {
					sumOdd += num;
				}

			}
		}
		System.out.println("Total sum of even numbers is " + sumEven);
		System.out.println("The total sum of odd numbers is " + sumOdd);

		System.out.println("Second Exercice ------------------------------------------------------");
		System.out.println();
		// Example 2: Find the Maximum and Minimum Number in a 2D Array
		// assuming the first and the last elements are min and max

		int max = numbers[0][0];
		int min = numbers[0][0];

		// using a regular for loop

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] > max) {
					max = numbers[row][col]; // update max
				}
				if (numbers[row][col] < min) {
					min = numbers[row][col]; // update min
				}
			}
		}
		System.out.println("Maximum numbers if " + max);
		System.out.println("Minimin number is " + min);

		System.out.println();
		System.out.println("Third Exercice ------------------------------------------------------");
		System.out.println();

		// Example 3: Find the Longest and Shortest Word in a 2D String Array

		String[][] words = { { "elephant", "dog", "cat" }, { "giraffe", "lion", "hippopotamus" },
				{ "tiger", "bear", "fox" } };

		String longestWord = words[0][0];
		String shortesWord = words[0][0];

		for (String[] row : words) {
			for (String word : row) {
				if (longestWord.length() > word.length()) {
					longestWord = word;
				}
				if (shortesWord.length() < word.length()) {
					shortesWord = word;
				}
			}
		}
		System.out.println("The longest word is " + longestWord);
		System.out.println("The shortes word is " + shortesWord);

		System.out.println();
		System.out.println("Forth Exercice ------------------------------------------------------");
		System.out.println();	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
