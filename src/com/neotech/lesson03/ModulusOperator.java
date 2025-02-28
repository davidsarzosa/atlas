package com.neotech.lesson03;

public class ModulusOperator {

	public static void main(String[] args) {

		int a = 25;
		int b = 4;

		int div = a / b; // --- lost whatever is after the decimal point

		// remainder --> 25/4 -- > 6 remainder = 1

		int remainder = a % b;

		System.out.println(div);
		System.out.println(remainder);

		// another example

		double d1 = 34.654;
		double d2 = 44.321;

		double d3 = d1 / d2;
		//double rem1 = d1 % d2;
		//System.out.println(rem1); ASK ABOUT THIS 
		System.out.println(d3);

		int c = 8;
		int d = 5;

		int rem = c % d;

		System.out.println(rem);

	}

}
