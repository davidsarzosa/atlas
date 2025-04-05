package com.neotech.lesson18;

import java.util.Arrays;

public class homework2 {

	// Write a program to print out the following conversion:
	// Today is Tuesday and we have a Java Class!!! to
	// yadoT si yadseuT dna ew evah a avaJ !!!ssalC.

	public static void main(String[] args) {

		String sentence = "Today is Tuesday and we have a Java Class!!!";
		System.out.println(sentence);
		// String[] result = sentence.split(" ");
//		System.out.print(Arrays.toString(result));
//		System.out.println();
		// System.out.print(result.length);

		homework2 hw2 = new homework2();
		System.out.println(hw2.reverseStringMethod(sentence));

	}

// we can create a method to do this
// input is String
// output is String 

	String reverseStringMethod(String input) {
		char[] CharArray = input.toCharArray();
		String reversedStr = "";

		for (int i = CharArray.length - 1; i >= 0; i--) {
			reversedStr += CharArray[i];
		}

		return reversedStr;
	}

}