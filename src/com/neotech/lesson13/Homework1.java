package com.neotech.lesson13;

public class Homework1 {

	public static void main(String[] args) {

		/*
		 * 1. Create a 2D array where you will store the following values: - Mr, Mrs,
		 * Ms, Miss -Smith, Jordan, Jackson, Obama.
		 * 
		 * After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 * 
		 * Be careful because they are mixed.
		 * 
		 */

		String values[][] = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama", } };

		String value1 = values[0][1] + " " + values[1][0];
		System.out.println(value1);

		String value2 = values[0][0] + " " + values[1][3];
		System.out.println(value2);

		String value3 = values[0][2] + " " + values[1][2];
		System.out.println(value3);

		String value4 = values[0][3] + " " + values[1][1];
		System.out.println(value4);

		System.out.println("--------------------------------");

		// there is always a different way to do things

		String names[][] = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama", } };

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);

	}

}
