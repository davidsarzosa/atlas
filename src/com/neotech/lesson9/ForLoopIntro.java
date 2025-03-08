package com.neotech.lesson9;

public class ForLoopIntro {
	public static void main(String[] args) {

		// printing numbers from 1 to 10

		int num = 1;
		while (num <= 10) {
			System.out.println(num + " ");
			num++;

		}
		System.out.println(num);

		// in this case I know exactly how many times i have to iterate.
		// for such cases, use the for loop.

		// in a for loop we have 3 selections :
		// INITIALIZATION , CONDITION , INCREMENT

		for (int num2 = 1; num2 <= 10; num2++) {
			System.out.println(num2 + " ");

		}

		// num2 is a local variable so it is created for the loop and can
		// only be used inside the for loop. Java does not recognize num2
		// outside the the for loop.
		// System.out.println(num2);

		// Another example will be something like
		System.out.println("========================================");

		for (int d = 1; d <= 20; d++) {
			System.out.println(d);
		}

		System.out.println("========================================");

		for (int h = 50; h >= 0; h--) {
			System.out.println(h);
		}

		
	}

}
