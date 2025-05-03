package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {

		int[] numbers = new int[6];
		// we set the size, it is fixed, cannot change

		// The syntax is:
		// ArrayList<objectType> variableName = new ArrayList<>();

		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);

		System.out.println("The size is: " + names.size());

		names.add("Maria");
		names.add("Paola");
		names.add("Ligia");
		names.add("Jorge");
		names.add(0, "Adrian");

		System.out.println(names);
		System.out.println("The size is: " + names.size());

		System.out.println("Iterate using for loop");

		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + " ");
		}

		System.out.println("Iterator using for each");

		for (String name : names) {
			System.out.print(name + " ");
		}

	}

}
