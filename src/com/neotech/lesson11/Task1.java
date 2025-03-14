package com.neotech.lesson11;

public class Task1 {

	public static void main(String[] args) {

		// Create an array of chars and store grades into it: A,B,C,D,E,F.
		// Then print a grade B (use 2 different ways of creating an array)
		// There shoud be 2 different ways to do it

		char[] grades = new char[6];

		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		// grades[6] = 'G'; // the arrays do not support more than 6 for an array

		System.out.println(grades[1]);

		char[] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F', };

		System.out.println(grades2[1]);

		System.out.println("==============PRACTICE=============");

		// For numbers does not matter, can be as muchnumbers as you want
		int david[] = { 1, 2, 3, 4, 5, 6, 8, 44, 44 };
		System.out.println(david.length);
		System.out.println(david[0]);

		System.out.println("===========PRACTICE MORE===========");

		double Paola[] = { 0.7, 40, 45, 56, 34, 23, };

		System.out.print(Paola[1]);

	}

}
