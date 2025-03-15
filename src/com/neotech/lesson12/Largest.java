package com.neotech.lesson12;

public class Largest {
	public static void main(String[] args) {

//	** Create an array of integers and calculate the largest element in the array
//	(use 2 different loops).

		int[] numbers = { 5, 15, 20, 30, 50, 10, 75, 40, 11 };

		// indexed for loop

		// lets assume the first number is the largest
		int largest = numbers[0];
		// in order to find the largest in array, i need to go through all the elements
		// in array
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}

		System.out.println("The largest number is: " + largest);

		// enhanced for loop
		int largest2 = numbers[0];
		for (int number : numbers) {
			if (number > largest2) {
				largest2 = number;
			}
		}

		System.out.println("The largest number is: " + largest2);

	}
}