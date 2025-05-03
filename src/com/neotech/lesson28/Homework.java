package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {

	/*
	 * Create a ArrayList that will store 5 names into it. ▪ Find out whether the
	 * given ArrayList is empty or not? ▪ Check whether the specific name is present
	 * in an ArrayList or not? ▪ Find the size of your ArrayList and print all
	 * values from the ArrayList
	 * 
	 */
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("John");
		names.add("Mak");
		names.add("Steven");
		names.add("Sophia");
		names.add("Leonardo");
		System.out.println("is the Array empy ? " + names.isEmpty()); // done
		System.out.println("this Array has the name Sophia in it ? " + names.contains("Sophia"));
		System.out.println(names.size());

		System.out.println(names);

		// using a enhance for loop
		for (String name : names) {
			System.out.print(name + " ");
		}

	}

}
