package com.neotech.lesson9;

public class BreakAndContinue {

	public static void main(String[] args) {

		System.out.println("==========Break============");

		System.out.println("Print numbers from 1 to 10 until 5 is hit ");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i + " ");
		}

		// next statement

		System.out.println("========Continue==========");

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);

		}

		// we are continuing the classes, here we will put some continue and break
		// again.

		System.out.println("========= break ===========================");
		System.out.println("Print the numbers from 1 to 50 until hits 30! ");
		System.out.println();

		for (int d = 1; d <= 50; d++) {
			System.out.println(d);
			if (d == 30)

				break;
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println();
		// now we will continue as well with the same comcept!

		for (int d = 1; d <= 50; d++) {
			System.out.println(d);
			if (d == 30)
				continue;

		}

		// a differet task but the same concept

		for (int l = 1; l <= 100; l++) {
			System.out.print(l + " ");
			if (l == 50)
				break;

		}
		System.out.println();

		for (int l = 1; l <= 100; l++) {
			System.out.print(l + " ");
			if (l == 50)
				continue;
		}
		System.out.println();

	}

}
