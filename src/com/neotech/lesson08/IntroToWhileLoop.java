package com.neotech.lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {

		// print numbers from 1 to 10

		// to avoid a loop that rung forever (infinite loop) we need a control variable

		int num = 1;

		while (num < 30) { // same as num <=10

			System.out.println(num + " ");
			num++; // this makes sure that my num keeps increasing so that makes the loop stop at
					// some point

			System.out.println();// this will shift my prints in a new line in the console

		}

		System.out.println("===================================");

		// another way to do the same thing

		num = 1;
		while (num < 11) {
			System.out.println(num++ + " ");
		}
		System.out.println();

		// How can I enter 5 numbers from the console ?

		Scanner scan = new Scanner(System.in);

		int var = 1;
		int n;

		// idea 1: start with 1, while var <= 5 perform the action (++)
		// idea 2: start with 5, while var > 5 perform the action (--)

		while (var <= 5) {
			System.out.println("Enter a number : ");
			n = scan.nextInt();
			System.out.println("The number is: " + n);

			var++;

		}

	}

}
