package com.neotech.lesson31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> months = new LinkedHashMap<>();
		months.put("Jan", 1);
		months.put("Feb", 2);
		months.put("Mar", 3);
		months.put("Apr", 4);
		System.out.println(months);
		System.out.println("The size is " + months.size());

		// Entry<String,Integer> entry --> an Entry object of string
		Set<Entry<String, Integer>> entries = months.entrySet();
		System.out.println(entries);

		// Now we can interact over our entries object using either a for loop
		// or an iterator object
		System.out.println("-------------------------------------------");

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry);
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		System.out.println("-------------------------------------------");
		// Also we can do using Iterator for the same thing
		Iterator<Entry<String, Integer>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey() + "--> " + entry.getValue());
		}
	}

}
