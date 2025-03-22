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
		System.out.println("The sum2 is: " + sum2);

		System.out.println("//////////////////");

		int num3[] = { 45, 34, 23, 45, 23, 45 };

		int sum3 = 0;
		for (int result : num3) {
			sum3 += result;
		}
		System.out.println("The sum3 is: " + sum3);

		System.out.println("//////////////////");

//		Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).

		int[] num4 = { 12, 23, 45, 56, 23, 6, 5, 45, 45 };
		int sum4 = 0;

		for (int result4 : num4) {
			sum4 += result4;
		}
		System.out.println("The sum4 is " + sum4);

	}

}
