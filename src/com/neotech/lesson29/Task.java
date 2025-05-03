package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	// Create an arrayList with 6 names.
	// Have at least 2 duplicates.
	// How can you remove the duplicates from the ArrayList?
	public static void main(String[] args) {

		List<String> ls = new ArrayList<>();
		ls.add("Pablo");
		ls.add("Pablo");
		ls.add("JoseMaria");
		ls.add("Penelope");
		ls.add("Ligia");
		ls.add("Ligia");
		System.out.println(ls);

		// LinkedHashSet -- no duplicates, keep the insertion order
		Set<String> lhs = new HashSet<>();
		lhs.addAll(ls); // duplicates are gone!
		System.out.println(lhs);

		// TreeSet -- no duplicates, ascending order
		Set<String> ts = new TreeSet<>();
		ts.addAll(ls);
		System.out.println(ts); // duplicates are gone, change to ascending order

		// How do I check if an element exist in a Set?
		if (lhs.contains("Penelope")) {
			System.out.println("Contains Penelope");
		}

		// How Can I access a specific element of the set?
		// I can convert it to a list
		List<String> list = new ArrayList<>(ts);
		System.out.println(list);

		// Get an element at index 3?
		System.out.println(list.get(3));

		// Can I convert the set to an array???? Yes
		Object[] array = lhs.toArray();
		System.out.println("--------");
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		// Arrays is a utility class for dealing with arrays

		// For collections we have another utility class
		Collections.sort(list);
		System.out.println(list);
		
		

	}
}
