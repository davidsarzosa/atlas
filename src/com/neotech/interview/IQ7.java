package com.neotech.interview;

import java.util.Arrays;

public class IQ7 {

	public static void main(String[] args) {

		/*
		 * 
		 * 7. Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array? Do it in one iteration.
		 * 
		 */

		// 1st way, Using Arrays.sort

		int[] numbers = { 1, 25, 5, 90, -1, 89, 74, 125, 25, 100 };
		// 1st way, Using Arrays.sort
		// This method will sort the numbers in the array
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		// sorting the numbers into the array will put them from smallest to the biggest

		// "The smallest is the first in the array
		System.out.println("the smalles is " + numbers[0]);
		// "The biggest is the last element in the array "
		System.out.println("the bigges is " + numbers[numbers.length - 1]);
		// "The second biggest is the one before the last element in the array " +
		// numbers[numbers.length - 2]);
		System.out.println("the second biggest is " + numbers[numbers.length - 2]);

		// there is a 2nd way without sorting

		int[] numbers2 = { 1, 25, 5, 90, -1, 89, 74, 125, 25, 100 };
		int biggest = numbers2[0];
		int secondBiggest = numbers2[0];
		int smallest = numbers2[0];

		System.out.println("---------------------------------");
		// for (int i = 0; i < numbers2.length; i++) {
		// if()

		for (int el : numbers2) {
			if (el > biggest) {
				// we found a bigger number
				secondBiggest = biggest;
				biggest = el;
			} else if (el > secondBiggest) {
				secondBiggest = el;
			}
			if (el < smallest) {
				// we found a smaller number
				smallest = el;
			}
		}
		System.out.println("Biggest is --> " + biggest);
		System.out.println("Second Biggest is --> " + secondBiggest);
		System.out.println("Smallest is --> " + smallest);
	}

}
