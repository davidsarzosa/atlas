package com.neotech.lesson12;

public class practiceJavalesson12 {

	public static void main(String[] args) {

//		Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).

		int numbers[] = { 34, 56, 12, 90, 27, 56, 23, 7, 8, 9, 0, 23 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("the sum of the numbers will be " + sum);

		int sum2 = 0;
		for (int number : numbers) {
			sum2 += number;
		}
		System.out.println("the sum of the numbers will be " + sum2);

		System.out.println("---------------------------------------");

		// here we are modifying the ode to find the average for all numbers

		int sum3 = 0;
		for (int number : numbers) {
			sum3 += number;
		}
		System.out.println("the sum of the numbers will be " + sum3);
		// here is the way to get the average for the sum1, sum2, sum3

		System.out.println("---------------------------------------");
		double average = (double) sum3 / numbers.length;
		System.out.println(average);

		// Keep practicing
		System.out.println("---------------------------------------");

//		2. Count Even and Odd Numbers
//		Write a program that counts how many even and odd numbers are in the array.
		// here is the sum and also the count of the odd and even numbers

		int numbers1[] = { 23, 4, 5, 6, 1, 23, 45, 23, 45, 654, 23, 54, 12, 45, };

		int evenCount = 0, oddCount = 0;
		int evenSum = 0;
		int oddSum = 0;

		for (int count : numbers1) {
			if (count % 2 == 0) {
				evenCount++;
				evenSum += count;
			} else {
				oddCount++;
				oddSum += count;
			}
		}

		System.out.println("The count of even numbers = " + evenCount);
		System.out.println("The count of odd numbers = " + oddCount);
		System.out.println("The sum of even numbers = " + evenSum);
		System.out.println("The count of odd numbers = " + oddSum);

		System.out.println("---------------------------------------");

//		3. Reverse the Array
//		Write a program to reverse the order of elements in an array.
//

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		for (int i = numbers1.length - 1; i >= 0; i--) {
			System.out.print(numbers1[i] + " ");
		}

		System.out.println("--------------------------------------");

		// find the duplicates in the array
		System.out.println("Find the duplicates");

		for (int i = 0; i < numbers.length -1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println(numbers[i]);
				}
			}
		}

		
		
		
	}

}
