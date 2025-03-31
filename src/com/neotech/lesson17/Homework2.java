package com.neotech.lesson17;

import java.util.Scanner;

public class Homework2 {
//	Write a program that reads two parent's first names and if they expecting boy or girl?
//    Based on the input suggests a name for a baby:
//    If it is a boy get half from dad and half from mom.
//    If it is a girl get half from mom and half from dad.
//
//        Example Output:
//            Mom's first name? Mary
//            Dad's first name? Daniel
//            Boy or Girl? boy
//            Suggested baby name: DANRY
//        Example Output:
//            Mom's first name? Mary
//            Dad's first name? Daniel
//            Boy or Girl? girl
//            Suggested baby name: MAIEL
//		 
//		 */

	public static void main(String[] args) {

		// Gets the parents names first

		Scanner inputScan = new Scanner(System.in);

		System.out.println("Enter the father's name: ");
		String dad = inputScan.next();
		System.out.println("Enter the mother's name : ");
		String mom = inputScan.next();

		// get the gender ?

		String babyName = ""; // we are looking for this!

		System.out.println("Are you specting a boy or a girl ? ");
		String gender = inputScan.next();

		// Calculate half lengths!

		int dadHalf = dad.length() / 2;
		int momHalf = mom.length() / 2;

		if (gender.equals("boy")) {
			babyName = dad.substring(0, dadHalf) + mom.substring(0, momHalf);

		} else if (gender.equals("girl")) {
			babyName = mom.substring(0, momHalf) + dad.substring(0, dadHalf);
		} else {
			System.out.println("Enter boy or girl");
			return;
		}
		System.out.println("Suggested baby name: " + babyName);

	}
}
