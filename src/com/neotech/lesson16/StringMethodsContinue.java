package com.neotech.lesson16;

public class StringMethodsContinue {

	public static void main(String[] args) {

		// contains()

		String sentence = "Hope is what you live for!";
		boolean response = sentence.contains("Hope");
		// Same as saying --> does the String sentence contain this element ? YES/NO()
		// (TRUE/FALSE)
		System.out.println(response);

		// How would I check if I want to ignore case ??

		System.out.println(sentence.toLowerCase().contains("hope"));

		// I could do this in two lines
		// String lower = sentence.toLowerCase();
		// lower.contains("hope");

		// equals()

		String s1 = "Tuesday";
		String s2 = "tuesday";

		boolean equals = s1.equals(s2);

		System.out.println(equals);
		System.out.println("---------------------");
		// equalsIgnoreCase()
		System.out.println(s1 + " " + s2);

		boolean equals2 = s1.equalsIgnoreCase(s2);

		System.out.println(equals2);

		// instead of euqalsIgnoreCase(), I could do this:
		System.out.println("---------------------");
		boolean equalsUsingLower = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println(equalsUsingLower);

		// Step by Step
		System.out.println("---------------------");
		String s1Upper = s1.toUpperCase();
		String s2Upper = s2.toUpperCase();
		boolean compare = s1.toUpperCase().equals(s2Upper);
		System.out.println(compare);

		// StartsWith()
		System.out.println("---------------------");
		boolean starts = sentence.startsWith("Hope");
		System.out.println("Does it starts with Hope ? " + starts);

		System.out.println("---------------------");
		boolean ends = sentence.endsWith("for!");
		System.out.println("Does is ends with for!? " + ends);

	}

}
