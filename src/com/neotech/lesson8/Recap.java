package com.neotech.lesson8;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		// find the largest number among three different numbers

		Scanner scan = new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter three different number : ");

		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		// we are using nested if

		if (a > b) // a > b
		{
			if (a > c) {

				System.out.println(a + "is the largest number !! ");
			} else // c > a
			{
				System.out.println(c + "is the largest number !!  ");
			}
		} else // b > a
		{
			if (b > c) // b > c
			{
				System.out.println(b + "is the largest number !! ");
			} else // c > b
			{
				System.out.println(c + "is the larges number!! ");
			}
		}

		// using logical operators
		if (a > b && a > c) {
			System.out.println(a + "Is the largest number !!  ");

		} else if (b > a && b > c) {
			System.out.println(b + " s the largest number !! ");
		} else // c is the largest
		{
			System.out.println(c + "is the largest number !! ");
		}

	}

}
