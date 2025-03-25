package com.neotech.interview;

public class IQ3 {

	public static void main(String[] args) {

		// 3. Write a Java Program to print the first 10 numbers of Fibonacci series.

		// Fibonacci series: The next number is the sum of two previous numbers
		// You have to print -> 1,1,2,3,5,8,13,21,34,55...

		int num1 = 1;
		int num2 = 1;
		int next; // I will use a temporary variable

		for (int i = 1; i <= 10; i++) {
			System.out.print(num1 + ",");
			next = num1 + num2; // find the next number
			num1 = num2; // shift the next one
			num2 = next; // shift the number 2
		}
		// a second way
		System.out.println("\n-------------------------------");
		int a = 1;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print(a + ",");
			// shift numbers
			b = b + a;
			a = b - a;

		}

		// We can do it use it an array

		System.out.println("\n-------------------------------");

		int arr[] = new int[10];
		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		// Use Arrays class to print the array
		// System.out.print(Arrays.toString(arr));

		// Use enhanced for loop
		for (int n : arr) {
			System.out.print(n + ",");
		}

	}
}
