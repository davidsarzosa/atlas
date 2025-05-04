package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order.
	 * 
	 * As a key, store the name of the city and as a value store the length of the
	 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). - If any city
	 * name is more than 5 characters remove that city .
	 * 
	 */

	public static void main(String[] args) {

		String[] cities = { "Luxenburgo", "Milan", "Medellin", "Quito", "Tokio" };
		TreeMap<String, Integer> cityMap = new TreeMap<>();
		for (int i = 0; i < cities.length; i++) {
			if (cityMap.toString().length() > 5) {
				cityMap.remove(cities);
			}
			cityMap.put(cities[i], i);
		}

	}
}
