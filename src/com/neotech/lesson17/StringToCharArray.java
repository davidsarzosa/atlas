package com.neotech.lesson17;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// toCharArray

		String sentence = "Today is Thursday and we'are leagning Java! ";
		char[] charArray = sentence.toCharArray();
		System.out.println(charArray);
		System.out.println("------------------------");
		String sentence1 = "La azafata es hermosa pidele el numero de telefono  ";
		char[] charArray1 = sentence1.toCharArray();
		System.out.println(charArray1);
		System.out.println("------------------------");

		// using enhance for loop
		for (char c : charArray) {
			System.out.print(c + "|");

		}

		System.out.println();
		System.out.println(Arrays.toString(charArray));
		System.out.println("------------------------");

		System.out.println(Arrays.toString(charArray1));
		for (char c1 : charArray1) { // apparently there is just one way to call the enhanced for loop.
			System.out.print(c1 + "|");

		}
		System.out.println("------------------------");

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		
		// how would I do this (Homework?): 
		// 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
