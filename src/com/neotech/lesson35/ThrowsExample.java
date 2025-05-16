package com.neotech.lesson35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {
		calculator();
		try {
			read("");
		} catch (FileNotFoundException fnfe) {
			System.out.println();
		}
		System.out.println("Other stuff do after I read the file .... ");

	}

	public static void calculator() {
		// When using methods/actions that can throw exception I have to options
		// 1. handle it myself
		// 2. pass it along -- throws ArithmeticAexception

		try {
			division(10, 2);
			division(9, 3);
			division(7, 0);
			division(4, 4);

		} catch (ArithmeticException ae) {
			System.out.println("The AE is handled! ");
		}
	}

	// here we need a return type
	public static void division(int a, int b) throws ArithmeticException {
		System.out.println(a / b);

	}

	// Seeing the same thing for another type of exception (checked)

	public static void read(String filePath) throws FileNotFoundException {
		{
			FileInputStream fis = new FileInputStream(filePath);

		}
	}
}
