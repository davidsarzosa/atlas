package com.neotech.lesson15;

public class TestCalcWithReturn {

	public static void main(String[] args) {

		CalculatorWithReturn cal = new CalculatorWithReturn();

		// addition
		int result = cal.add(10, 20);
		System.out.println(result);
		// OR
		System.out.println(cal.add(90, 140)); // Beauty!

		// Multiplication
		System.out.println(cal.multiply(465, 45));

		// Division
		double result1 = cal.divide(9633.5, 67);
		System.out.println(result1);

		// givMeSomething
		System.out.println("Give me something" + cal.giveMeSomething());

		// giveMeNothing
		cal.giveMeNothing();

		System.out.println("avg of 5, 7, and 3 is " + cal.average(5, 7, 3));

		// Multiply 2 with the AVG of 5,7 and 3;
		System.out.println(cal.multiply(2, (int) cal.average(5, 7, 3)));

	}

}
