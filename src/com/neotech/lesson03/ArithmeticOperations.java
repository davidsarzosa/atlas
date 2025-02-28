package com.neotech.lesson03;

public class ArithmeticOperations {

	public static void main(String[] args) {

		// type name = value
		// type + name; ---> declaration

		int num1, num2, num3, num4;

		// initialization

		num1 = 545;
		num2 = 80;
		num3 = 45;
		num4 = 56;

		int sum = num1 + num2;
		int res = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;

		System.out.println("Sum: " + sum);
		System.out.println("Rest: " + res);
		System.out.println("mult: " + mult);
		System.out.println("div: " + div);

		double d1, d2, d3, d4;

		d1 = 27;
		d2 = 5;
		d3 = 45;
		d4 = 75;

		double div_doubles = d1 / d2;
		System.out.println(div_doubles);

		double div_int = num1 / num2; // the result of two integers, is int
		System.out.println(div_int);

		double div_doubles1 = d3 / d4;
		System.out.println(div_doubles1);

		double div_int1 = num3 / num4;
		System.out.println(div_int1);
		
		

	}

}
