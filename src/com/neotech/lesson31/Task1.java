package com.neotech.lesson31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1 {

	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order.
	 * 
	 * 
	 * As a key, store the name of the city and as a value store the length of the
	 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). - If any city
	 * name is more than 5 characters remove that city .
	 */

	public static void main(String[] args) {

		String cities[] = { "Luxenburgo", "Paris", "Milan", "Atlanta", "Minesota", "Miami", "New York", "Texas",
				"Missisipi", "Kansas", "San Diego" };

		Map<String, Integer> mc = new HashMap<>();
		for (String city : cities) {
			mc.put(city, city.length());
		}
		System.out.println(mc);

		Set<Entry<String, Integer>> allEntries = mc.entrySet();
		Iterator<Entry<String, Integer>> it = allEntries.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > 5) {
				it.remove();
			}
			

		}
		System.out.println(allEntries);
		System.out.println(mc);
	}

}
