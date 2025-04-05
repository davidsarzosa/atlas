package com.neotech.lesson18;

import java.nio.Buffer;
import java.util.Arrays;

public class Homework {

	// Create a String and print it in reverse order (Sunday -> yadnuS).
	// Solve it using charAt(), toCharArray() and reverse() methods.
	// Note:
	// for charAt() and toCharArray() use String
	// for reverse you have to declare a StringBuffer object

	public static void main(String[] args) {

		String str = "Sunday";
		System.out.println(str.length() - 1);
		System.out.println(str.toString());

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i); // get the char at index i
			System.out.print(c);

		}
		System.out.println();
		System.out.println("---------------");

		// 2nd way: using toCharArray();
		// this method breaks the string into a char array

		char[] arr = str.toCharArray();
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			char c = arr[i];
			// System.out.print(i); // this is printing the numbers
			System.out.print(c);
		}
		System.out.println();
		System.out.println("---------------");

		// 3d way using the reverse() method

		StringBuffer strBuffer = new StringBuffer(str);
		System.out.print(strBuffer.reverse());
		System.out.println("---------------");
		System.out.println(str);

		// 4th way: using string builder

		StringBuilder strBuiler = new StringBuilder(str);
		System.out.print(strBuiler.reverse());

	}

}
