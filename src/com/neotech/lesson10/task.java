package com.neotech.lesson10;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {

		// Get input from the user, then based on that print this structure
//		For ex: input = 5

		// 1
//		22
//		333
//		4444
//		55555
//		4444
//		333
//		22
//		1
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Type your input :");
//		int result;
//		
//
//		result = input.nextInt();
//
//		for (int i = 1; i <= result; i++) {
//			for (int c = 0; c < i; c++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//	
//		//System.out.println("Type your input again:");
//		result = input.nextInt();
//		for (int p = result-1; p >= 1; p--) {
//			for (int l = 0; l < p; l++) {
//				System.out.print(p);
//
//			}
//
//			System.out.println();
//
//		}

//		Get input from the user, then based on that print this structure
//		For ex: input = 5

//		1
//		22
//		333
//		4444
//		55555
//		4444
//		333
//		22
//		1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the pattern:");
		int size = scan.nextInt();

		for (int row = 1; row <= size; row++) {
			// first loop: row = 1, col: 0 to 1 (print row)
			// second: row = 2, col: 0 to 2 (print row)
			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

		for (int row = size - 1; row >= 1; row--) {
			// first loop: row = 1, col: 0 to 1 (print row)
			// second: row = 2, col: 0 to 2 (print row)
			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}

		System.out.println("=========================Practice=====================");

		for (int r = 1; r <= size; r++) {
			for (int c = 0; c <= r; c++) {
				System.out.print(r);

			}
			System.out.println();

		}

		for (int r = size - 1; r >= 1; r--) {
			for (int c = 0; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
