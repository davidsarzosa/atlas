package com.neotech.interview;

public class IQ4 {

	public static void main(String[] args) {

		// Find out how many alpha characters are present in a String?
		// Find the number of words in a string?

		String str = "dfg%^&#DF32154 ere @#67";

		// Replace all characters that are not letters with nothing
		str = str.replaceAll("[^A-Za-z]", ""); // this is a regular expression [^A-Za-z]
		System.out.println(str);

		System.out.println("number of alpha characters = " + str.length()); // this is a method

		System.out.println("-----------------------------------------------");

		String longStr = "bye bye Java hello Selenium";

		String[] words = longStr.split(" ");
		System.out.println("number of words in a String " + words.length);// this is a property of the array
		for (String el : words) {
			System.out.print(el + " ");
		}
	}

}
