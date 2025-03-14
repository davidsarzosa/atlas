package com.neotech.lesson10;

public class Task3 {
	public static void main(String[] args) {

		/*
		 *
		 * 
		 * * * * * * * * * * *
		 * 
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			for (int s = 0; s <= i; s++) {
				System.out.print(" *");
			}

			System.out.println();

		}

	}

}
