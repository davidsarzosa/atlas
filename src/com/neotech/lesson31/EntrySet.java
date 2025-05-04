package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();

		countries.put("France", "Paris");
		countries.put("Spain", "Madrid");
		countries.put("Italy", "Rome");
		countries.put("Germany", "Berlin");
		countries.put("Turkiye", "Istanbul");
		countries.put("Albania", "Tirana");

		System.out.println("Size of counrtry list are " + countries.size());
		System.out.println(countries);

		System.out.println("PRINTING ALL ENTRIES ");
		// This will print all keys and values
		Set<Entry<String, String>> allEntries = countries.entrySet();
		System.out.println(allEntries);

		System.out.println("print all values in UPPERCASE");
		for (Entry<String, String> entry : allEntries) {
			// System.out.println(entry.toString().toUpperCase());
			String value = entry.getKey();
			String key = entry.getKey();
			System.out.println(value.toUpperCase() + " --> " + key.toUpperCase());
		}
		System.out.println();
		System.out.println("Another way will be just ");
		for (Entry<String, String> entry2 : allEntries) {
			System.out.println(entry2.toString().toUpperCase());

		}

		// Now using Iterator
		System.out.println("\n--------------------USING ITERATOR--------------------------------");
		Iterator<Entry<String, String>> ik = allEntries.iterator();
		while (ik.hasNext()) {
			String key = ik.next().getKey();
			System.out.print(key + " ");
		}
		System.out.println();
		Iterator<Entry<String, String>> iv = allEntries.iterator();
		while (iv.hasNext()) {
			String value = iv.next().getValue();

			System.out.print(value + " ");
		}
		System.out.println("\n--------------------USING ITERATOR--------------------------------");
		// USING ITERATOR
		Iterator<Entry<String, String>> it = allEntries.iterator();
		while (it.hasNext()) {
			Entry<String, String> value = it.next();
			System.out.println(value.getKey().toUpperCase() + "-->" + value.getValue().toUpperCase());
		}

	}

}
