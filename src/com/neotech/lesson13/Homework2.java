package com.neotech.lesson13;

public class Homework2 {
	public static void main(String[] args) {

		/*
		 * 
		 * Create a 2D array that first row will contain 4 names and second row will
		 * contain grades, all Strings. Then you program should print name of the
		 * students that has A and B grade
		 * 
		 */

		String students[][] = { { "Juan", "Eugenio", "Consuelo", "Ligia" }, { "A", "C", "A", "B" } };

		// to get the size of the length Java we need
		System.out.println(students.length);

		// how to get the value of each row from the length
		System.out.println(students[0].length);
		System.out.println(students[1].length);

		// now we can continue with this

		System.out.println("------------");
		for (int i = 0; i < students[0].length; i++) {
			if (students[1][i].equals("A") || students[1][i].equals("B")) {
				System.out.println(students[0][i] + " " + students[1][i]);
			}

		}

	}

}
