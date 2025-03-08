package com.neotech.lesson8;

import java.util.Scanner;

public class ExercicesWhileLoop {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int var2 = 10;
		int n2;

		while (var2 >= 1) {
			System.out.println("Enter a number : ");
			n2 = scan.nextInt();
			System.out.println("This is the number " + n2);

			var2--;
		}
		System.out.println();

		// Ask the console to print 10 numbers ussing ++ and --

		// Scanner scan1 = new Scanner(System.in);

		System.out.println("===================================================");

		int var1 = 1;
		int n;

		while (var1 <= 10) {
			System.out.println("Enter a number : ");
			n = scan.nextInt();
			System.out.println("This is the number " + n);

			var1++;

		}
		System.out.println();

	}

}