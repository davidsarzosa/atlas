package com.neotech.lesson08;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		// Allow user to enter grade and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad,
		// any other grade --> Not Acceptable.
		// At the end your program should print which grade
		// was entered by the user with explanation.

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Provide please your grade ? ");
		char grade = myScanner.next().charAt(0);
		// String result;

		String result;

		switch (grade) {
		case 'a':
			// System.out.println("Excellent");
			result = "A - Excellent";
			break;
		case 'b':
			result = "B - Good";
			break;
		case 'c':
			result = "C - Average";
			break;
		case 'd':
			result = "D - Bad";
		default: {
			result = "Not acceptable input ";
			break;

		}
		
		}

		//System.out.println(result);

		System.out.println("============================");

		if (grade == 'A' || grade == 'a') {

			System.out.println("A - Excellent");
		} else if (grade == 'B') {
			System.out.println("B - Good");
		} else if (grade == 'C') {
			System.out.println("C - Average");
		} else if (grade == 'D') {
			System.out.println("D Bad ");
		} else {
			System.out.println("Not acceptable input");
		}

	}

}
