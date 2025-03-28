package com.neotech.lesson17;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {

		// split();

		String sentence = "Pidele el numero a la azafata , invitale un cafe";
		String[] result = sentence.split(" ");

		for (String word : result) {
			System.out.print(word + "-");
		}
		System.out.println();
		System.out.println("------------------------");

		System.out.println("the sentence has " + result.length + " words");
		System.out.println("------------------------");

		// we can gerex as a split criteria
		String list = "1David2Paola3Consuelo4Mario5Jujio6Maelito7Juan";

		String[] names = list.split("[0-9]"); // [1,2,3,4,]
		for (String name : names) {
			System.out.print(name + "\t"); // a tab space
		}
		System.out.println();
		// Can I print an array directly

		// Array is a array utility class
		System.out.println(Arrays.toString(names));

	}

}
