package com.neotech.lesson08;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {

//		1. Write a program using while loop that calculates the sum 
		// of the even numbers between 0 and 10.

		// for small numbers this will work
//		System.out.println(2 + 4 + 6 + 8 + 10);

		// defining a loop:
		// we start at 0 and go up to 10
		// check if the number is even
		// if yes, add it to the final result

//		int i = 0;
//		int sum = 0; // This is the first step, Declaring 2 numbers in 0 to find the number and SUM
//						// the other
//
//		while (i <= 10) { // using WHILE for running the loop till becomes 10, THE EXECUTION CONDITION HAS
//							// TO BE TRUE.
//			if (i % 2 == 0) { // 3 step ! adding IF CONDITION TO CHECK IF IS EVEN NUMBER
//				sum += 1;
//
//			}
//			i++; // 4 INCRISING THE NUMBER BY 1 UNTILL THE LOOP FINISHED
//		}
//
//		System.out.println("This is the result: " + sum);// 5 PRINT THE RESULT
//
//		// now the other way
//
//		int m = 0;
//		int sum2 = 0;
//
//		while (m <= 10) {
//			sum2 += m;
//			m += 2;
//		}
//
//		System.out.println("sum2 is " + sum2);
//
//		System.out.println("====================================");

		// 10 examples to type with steps

		// we are trying here to sum EVEN numbers from 0 to 20

		int p = 0;
		int sumP = 0;

		while (p <= 100) {
			if (p % 2 == 0) {
				sumP += p;
			}
			p++;
		}
		System.out.println("The sum of the numbers is + " + sumP);

		// This is a sum of odd numbers fomr 1 to 15
		int c = 1;
		int sumC = 0;

		while (c <= 56) {
			if (c % 2 != 0) {
				sumC += c;
			}
			c++;
		}

		System.out.println("The sum of odd numbers from 1 to 55 is + " + sumC);

		// This is a example 3 // Sum of Multiples of 3 from 3 to 30

		int m = 3;
		int sum4 = 0;
		while (m <= 30) {
			if (m % 3 == 0) {
				sum4 += m;

			}
			m += 3;
		}
		System.out.println("The sum of Multiples of 3 to 30 is " + sum4);

		System.out.println("==========================================");

		// System.out.println("The sum of Even numbers from 50 to 100 ");

		int a = 50;
		int sum5 = 0;

		while (a <= 100) {
			if (a % 2 == 0) {
				sum5 += a;
			}
			a++;
		}

		System.out.println("Here is the sum for even from 50 to 100 = " + sum5);

	}

}
