package com.neotech.lesson09;

public class homework1 {

	public static void main(String[] args) {

		// 1. Write a program using while loop that calculates the sum
		// of the even numbers between 0 and 10.

		int i = 0;
		int sum = 0;

		while (i <= 10) {
			if (i % 2 == 0)
				sum += i;

			i++;

		}

		System.out.println(sum);
		System.out.println("==========================================================");
		// This will be w/o the help of the other numbers so, will be just adding some
		// numbers instead

		int p = 0;
		int sump = 0;

		while (p <= 10) {
			sump += p;
			p += 2;

		}
		System.out.println("Here will be the same result " + sump);

		
		
		
		
		
		
		
		
		
		
		
	}

}
