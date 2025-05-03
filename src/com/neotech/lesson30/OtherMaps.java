package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {

		// TreeMap: will order pairs alphabetically according to the key

		Map<String, Integer> groceries = new TreeMap<>();
		groceries.put("Tomatoes", 3);
		groceries.put("Chiken", 20);
		groceries.put("Bread", 5);
		groceries.put("Eggs", 15);
		groceries.put("Meet", 30);
		groceries.put("Oranges", 10);
		groceries.put("a", 23); // is very sensitive case so, this will be at the end

		System.out.println(groceries);

		Set<String> keys = groceries.keySet(); // getting just keys
		System.out.println(keys); // printing just keys

		// iterate through keys
		for (String key : keys) {
			System.out.print(key + groceries.get(key) + " - "); // Printing just the string w/o
		}

		System.out.println();
		Collection<Integer> values = groceries.values();
		// USING ITERATOR

		Iterator<Integer> it = values.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
//			int value = it.next();
//			System.out.print(value + " ");

		}

	}

}
