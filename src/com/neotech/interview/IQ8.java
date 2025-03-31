package com.neotech.interview;

import java.util.*;

public class IQ8 {

//  8. How can you remove all duplicates from ArrayList?
//	You can create a new ArrayList and add the values one by one, checking if the
//	object exists or not. You can also use a Set.

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Mateo");
		names.add("Ligia");
		names.add("Jorge");
		names.add("Adrian");
		names.add("Juan");
		names.add("Ligia");
		names.add("Adrian");

		// This will add all the list elements into the newly created set
		Set<String> set = new LinkedHashSet<>(names);
		// System.out.println(set);

		names.clear(); // removes all the elements from the list
		names.addAll(set); // get everything from the set an add it to the names
		System.out.println(names); // this is no duplicates
		System.out.println("---------------------------");

		// Second way, create a new list and add the elements one by one
		// before adding check if the new List already contains the element

		List<String> names2 = new ArrayList<>();
		names2.add("Mateo");
		names2.add("Ligia");
		names2.add("Jorge");
		names2.add("Adrian");
		names2.add("Juan");
		names2.add("Ligia");
		names2.add("Adrian");

		// let me create an empty list of Strings

		// We created an empty list
		List<String> names3 = new ArrayList<String>(); //
		for (String name : names2) {
			// add the element, if it is not already in the list
			if (!names3.contains(name))
				names3.add(name);
		}
		System.out.println(names3);

	}
}
