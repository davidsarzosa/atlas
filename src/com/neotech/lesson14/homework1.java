package com.neotech.lesson14;

public class homework1 {

	public static void main(String[] args) {

//		Homework 1:
//			Create an array of countries: north America countries,
//			south America countries, Europe countries, 
//			Asian countries, African countries. 
//			Then print all values from that array using 2 different loops
//			and calculate how many total countries been stored.

//			IQ
//
//			Write a java program to find the second
// 			largest number in the array? Maximum and minimum number in the array?

		String[][] countries = { { "Mexico", "Canada", "US", }, { "Peru", "Argentina", "Brasil", },
				{ "Philipines", "Japan", "China", }, { "France", "Germany", "Spain", } };

		// apply logic

		for (String[] country : countries) {
			for (String col : country) {
				System.out.print(col + " ");
			}
		}
		System.out.println();

		// using a different loop
		System.out.println("----------------------");

		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");
			}

		}

		System.out.println();
		System.out.println("----------------------");

		int numbers[][] = { { 12, 34, 45, 56, }, { 3, 4, 5, 6, 7, } };

		// we need to assume to find the longest and the short number

		int longestNumber = numbers[0][0];
		int shortNumber = numbers[0][0];

		// we need the enhanced for loop to iterate the search

		for (int[] number : numbers) {
			for (int num : number) {
				if (longestNumber > num) {
					longestNumber = num;
				}
				if (shortNumber < num) {
					shortNumber = num;
				}
			}
		}
		System.out.println("The longest numnber is " + longestNumber);
		System.out.println("The shortest numnber is " + shortNumber);

	}

}
