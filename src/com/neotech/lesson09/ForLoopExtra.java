package com.neotech.lesson09;

public class ForLoopExtra {
	public static void main(String[] args) {

		System.out.println("Print the numbers from 21 to 30");

		for (int i = 21; i >= 30; i++) {
			System.out.println(i + " ");

		}

		System.out.println("====================================");
		System.out.println("Print the even numbers from 20 to 1 ");

		for (int e = 20; e >= 1; e = e - 2) {

			System.out.print(e + " ");

		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println("Print the even numbers from 100 to 1 ");

		for (int i = 100; i >= 1; i = i - 2) {
			System.out.print(i + " ");

		}

		System.out.println();
		System.out.println("=====================================");
		System.out.println("Print the even numbers from 1000 to 1");
		for (int i = 1000; i >= 1; i = i - 2) {
			System.out.print(i + " ");

		}

		System.out.println("Print the ODD numbers from 0 to 10");
		for (int i = 1; i <= 10; i = i + 2) {

			System.out.println(i + " ");

		}

		// second way to do it with a if()

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");
			}

		}

		System.out.println("\ncalculate the sum of odd numbers rom 1 to 50  ");

		int sum = 0;

		for (int i = 1; i <= 50; i += 2) {
			sum += i;
		}

		System.out.println("the sum will be " + sum);

		
		
		
	}

}
