package com.neotech.interview;

public class IQ5 {

	public static void main(String[] args) {

		// 5. Write a java program to reverse a String?
		// Reverse a string word by word?

		String str = "MaelitoAlekseiv";
		System.out.println(str);
		// First Way
		System.out.println("reverse str -- > " + reverseOne(str));
		// Second Way
		System.out.println("Reverse str2 --> " + reverseTwo(str));
		// 3rd way, using StringBuffer

		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); // String Buffer is mutable
		System.out.println("reverse string using String Buffer --> " + sb);

		String longStr = "La leche de la vaca no es para humanos";
		System.out.println(longStr);

		String[] words = longStr.split(" ");

		String reversedStr = " ";
		// Start from the last element to the first one
		for (int i = words.length - 1; i >= 0; i--) {
			reversedStr += words[i] + " ";
		}
		System.out.println(reversedStr);

	}

	// this will be with a method reverse

	public static String reverseOne(String str) {
		// 1st way of solving : using charAt();
		// get all the characters one by one from the last to the first one
		String reverseStr = ""; // i need a index here
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i); // Get the char from str using index i

		}
		return reverseStr;

	}

	public static String reverseTwo(String str) {

		// 2nd way is using toChatArray()

		String reverseStr = "";
		char[] charArray = str.toCharArray();

		// Im getting the chat from the chat one by one, but backwards
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseStr += charArray[i]; // get the char from charArray using index i

		}
		return reverseStr;
	}

}
