package com.neotech.lesson9;

public class SkipNumbers {

	public static void main(String[] args) {

		// print number 10 to 1, skip 3, 6 and 9

		for (int i = 10; i >= 1; i--) {
			if (i == 10 || i == 8 || i == 2 || i == 1 || i == 4 || i == 5 || i == 7)
				System.out.println(i + " ");

		}

		System.out.println("==================================");
		for (int i = 10; i >= 1; i--) {
			if (i == 3 || i == 6 || i == 9) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println();
		for (int i = 10; i >= 1; i--) {
			if (i % 3 == 0) {
				continue;

			}
			System.out.println(i);

		}
		System.out.println();
		// Prints numbers from 20 to 40
		// but skip 27 to 30

		for (int i = 20; i <= 40; i++) {
			if (i >= 27 && i <= 30) {
				continue;
			}
			System.out.println(i);
		}

	}

}
