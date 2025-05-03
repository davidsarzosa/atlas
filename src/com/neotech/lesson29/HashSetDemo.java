package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> breakfast = new HashSet<>();

		breakfast.add("eggs");
		breakfast.add("chesse");
		breakfast.add("tea");
		breakfast.add("coffee");
		breakfast.add("apples");
		// ADDING A DUPLICATE WILL BE IGNORED
		breakfast.add("eggs");
		breakfast.add("chesse");
		breakfast.add(null);

		int size = breakfast.size();
		System.out.println("the size of breakfast is " + size);

		System.out.println(breakfast);
		// If yu notice all the usage up to here, is exactly the same
		// as with any list
		// (excluding the first line)

		// HashSet
		// - no promised order
		// - no duplicates
		// - allows the null element
		// order [null, eggs, tea, coffee, chesse, apples]
		// why does not maintain any order ?

		// loop through them using for each

		for (String element : breakfast) {
			System.out.print(element + " ");
		}
		System.out.println();

		// Can I use Iterator ? Yes! we can!

		Iterator<String> it = breakfast.iterator();
		while (it.hasNext()) {

			System.out.print(it.next() + " ");
			// String element = it.next();
			// System.out.print(element + " ");
		}

	}

}
