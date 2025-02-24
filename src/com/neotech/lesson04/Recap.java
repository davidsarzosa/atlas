package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {

		// Order of arithmetic operations

		// PEMDAS -- > Parenthesis, Exp, Multiplication, Division, Addition, Sub,

		int num1 = 5 + 5 + 5;
		System.out.println(num1);

		int num2 = 5 + 5 * 5;
		System.out.println(num2);

		int num3 = (5 + 5) * 5;
		System.out.println(num3);

		// could also add directly on the console
		System.out.println(5 * 5 + 5 / 5);

		int number1 = 15;
		int number2 = 2;

		// normally 15/4 --> 3.75 and that is actually the result, but because we are
		// storing it
		// in an int, then the decimal point is discarded

		int div = number1 / number2;
		System.out.println("div --> " + div);

		// 15 --> find the largest fully divisible number by 4 --> 12
		// 15 - 12 = 3

		int rem = number1 % number2; // modulus operator
		System.out.println("rem --> " + rem);

		System.out.println("----------------------------------------------------------------------------");

		System.out.println("Addition vs Concatenation ");

		int a = 10;
		int b = 10;

		String x = "Java";
		String y = "Tuesday";

		System.out.println(x + " " + y); // Java Tuesday / String + String
		System.out.println(x + y + a); // Java Tuesday 10 / String + String + int
		System.out.println(x + a + b); // Java 10 10 // String + String + String

		System.out.println(x + (a + b)); // JAVA 20

		// --> is an empty String

		System.out.println("" + a + b); // 1010

		System.out.println(a + b);

		// int + int + String + String

		System.out.println(a + b + x + y);
		// first part:

		// a + b(both are int) ---> 20
		// a + b + x ---> 20 x --> 20Java
		// 20Java + y ---> 20JavaTuesday

		System.out.println(x + y + a * b); // JavaTuesday100
		System.out.println(x + y + a + b); // JavaTuesday1010

		// Compilation Error
		// System.out.println(y * b); // Tuesday*10

		// Sooooo...

		// String + int ----> String
		// String + String ---> String
		// int + int ----> int
		// String * int ---> not allowed

		// int + int + int + int + String ----> (addition will happen then
		// concatenation)
		// String + int + int + int + int ----> String (all concatenations)

		String emptuStr = ""; // It is a string but its empty
		String scapeStr = " "; // It is a string but it has only a space, still NOT empty.

	}

}
