package com.neotech.lesson10;

public class EasyPatterns {
	public static void main(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}

		System.out.println();

		for (int i = 0; i < 4; i++) {
			System.out.print("*");

		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("============Practice==================");
		// this is not practical this is unnecessary work
		// this will be the best option and the best way to do it!

		for (int row = 5; row > 0; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("============Practice==================");

		for (int row = 5; row > 0; row--) {
			for (int col = 0; col < row; col++) {

				System.out.print("*");
			}
			System.out.println();
		}
		

		// you have to write a pattern and you can write the patter on the conlose
		// this is it
		// *****
		// ****
		// ***
		// **
		// *
//
//		for (int c = 5; c > 1; c--) {
//			for (int r = 5; r > 1; c--) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

	}
}
