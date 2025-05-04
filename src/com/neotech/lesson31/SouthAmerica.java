package com.neotech.lesson31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SouthAmerica {

	/*
	 * Create a map of countries with its capital that will store countries in
	 * alphabetical order. Add them randomly in the map. Example: "France" ->
	 * "Paris" "Kosovo" -> "Prishtina" "Turkey" -> "Ankara" "USA" -> "Washington DC"
	 * "Albania" -> "Tirana" "Italy" -> "Rome"
	 * 
	 * - Print the list and check the order of the countries. - Verify if you have
	 * your contry (Albania, Turkey) in the list ( use containsKey() method ) -
	 * Verify if a specific capital city is in the list ( use containsValue() method
	 * ) - Get all the keys (countries names) in a Set. Print all country names
	 * using for each loop. - Get all the values (capital names) in a Collection.
	 * Print all capital names using iterator.
	 */

	public static void main(String[] args) {

		Map<String, String> sa = new TreeMap<>();
		sa.put("Quito", "Ecuador");
		sa.put("Bogota", "Colombia");
		sa.put("Lima", "Peru");
		sa.put("Caracas", "Venezuela");
		sa.put("Buenos Aires", "Argentina");
		sa.put("Rio de Janeiro", "Brasil");
		sa.put("La Havana", "Cuba");
		sa.put("Santiago", "Chile");
		sa.put("La Paz", "Bolivia");
		System.out.println("List by alphabetial order " + sa);

		// Checking if there is in the list the Countries Venezuela, Bolivia, Chile
		// By Value
		boolean containsVenezuela = sa.containsValue("Venezuela");
		boolean containsBolivia = sa.containsValue("Bolivia");
		boolean containsChile = sa.containsValue("Chile");
		System.out.println(
				"Does the list contains Venezuela ? " + containsVenezuela + "\nDoes the list contains Bolivia? "
						+ containsBolivia + " \nDoes the list contains Chile ?" + containsChile);

		// Checking with method contains by contains key

		boolean hasEC = sa.containsKey("Quito");
		boolean hasArgentina = sa.containsKey("Buenos Aires");
		boolean hasChile = sa.containsKey("Santiago");
		boolean hasCuba = sa.containsKey("La Havana");

		System.out.println();
		System.out.println("CHECKING VALUES (CONTRIES");
		System.out.println("Does the list contains key Ecuador ? " + hasEC + " \nDoes the list contains key Argentina? "
				+ hasArgentina + " \nDoes the list contains key Chile " + hasChile
				+ " \nDoes the list contains key Cuba ? " + hasCuba);
		System.out.println();

		//Get all the keys (countries names) in a Set. Print all country names using for each loop.
		System.out.println("\nAll Key values of capital");
		Set<String> countries = sa.keySet();
		for (String countryValue : countries) {
			System.out.print(countryValue + " - ");
		}
		// - Get all the values (capital names) in a Collection. Print all capital name
		// using iterator.

		System.out.println("\nAll key values of countries ");
		Iterator<String> ci = sa.values().iterator();
		while (ci.hasNext()) {
			String capital = ci.next();
			System.out.print(capital + " - ");
		}
	}
}
