package com.neotech.lesson12;

public class Task2 {

	public static void main(String[] args) {

//		Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).

		int numbers[] = { 54, 65, 32, 5, 4, 321 };
		int sum = 0;

		// using index for loop
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println("The sum is " + sum);

		System.out.println("//////////////////");

		int sum2 = 0;
		for (int number : numbers) {
			sum2 += number;
		}
		System.out.println("The sum is " + sum2);

	}

}
