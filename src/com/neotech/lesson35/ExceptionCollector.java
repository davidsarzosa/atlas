package com.neotech.lesson35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionCollector {

	/*
	 * Homework 1: Create a static method that will return a List of Exceptions.
	 * Inside your method create objects of 4 exception classes using try and catch
	 * blocks and store them inside your list. Call your method inside main and
	 * print name and details of all Exception objects.
	 * 
	 */

	//

	// This is the Static method, so we can call it, without
	// creating an object of it
	// Returns a List of Exception.

	public static List<Exception> collectExceptions() {

		List<Exception> exceptions = new ArrayList<>();

		// Step 4 // Try-Cath BLOCKS, To Catch different exceptions

		try {

			// This is the first block
			int result1 = 10 / 0;
		}

		catch (ArithmeticException e) {
			exceptions.add(e);
		}

		try {
			// This is the second block
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {

			exceptions.add(e);

		}

		try {

			int[] arr = new int[3];
			int x = arr[5];
		}

		catch (ArrayIndexOutOfBoundsException e) {
			exceptions.add(e);
		}

		try {
			Integer.parseInt("abc");

		} catch (NumberFormatException e) {
			exceptions.add(e);

		}
		return exceptions;

	}

	public static void main(String[] args) {

		List<Exception> myExceptions = collectExceptions();

		for (Exception e : myExceptions) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		}

	}

}
