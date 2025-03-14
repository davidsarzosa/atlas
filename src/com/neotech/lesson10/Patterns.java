package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {

		int size = 50;

		for (int r = 1; r <= size; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");

			}

			System.out.println();

		}

		for (int r = size; r >= 0; r--) {
			for (int c = 0; c <= r; c++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
