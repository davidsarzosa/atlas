package com.neotech.lesson30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Homework {

	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 * 
	 * Homework 2: Create a Set of cities in which you want to make sure that
	 * insertion order is maintained. Using Iterator remove any city that starts
	 * with "A";
	 * 
	 * Homework 3: Create a Set collection that will hold Objects of Student Type.
	 * In this set we do not care about the insertion order. Each student object
	 * should have name and studentID. Display name of each student.
	 * 
	 */
	public static void main(String[] args) {

		Set<String> countries = new TreeSet<>();
		countries.add("Ecuador");
		countries.add("Brasil");
		countries.add("Colombia");
		countries.add("Peru");
		countries.add("Panama");
		countries.add("Mexico");
		countries.add("Nicaragua");
		countries.add("El Salvador");

		System.out.println("The size of the countries is " + countries.size());
		// System.out.println(countries);
		for (String element : countries) {
			System.out.print(element + " ");
		}
		System.out.println();

		// Using Iterator
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

//		System.out.println();
//		// Using for loop
//		for (int i = 0; i < countries.size(); i++) {
		// System.out.println(countries.get(i));
//		}

		/*
		 * Homework 2: Create a Set of cities in which you want to make sure that
		 * insertion order is maintained. Using Iterator remove any city that starts
		 * with "A";
		 */
		System.out.println();

		Set<String> cities = new LinkedHashSet<>();
		cities.add("Andalucia");
		cities.add("Venecia");
		cities.add("Quito");
		cities.add("Caracas");
		cities.add("Chicago");
		cities.add("Antioquia");
		cities.add("Bilbao");
		cities.add("Atenas");

		// To keep track of the removed cities
		List<String> removedCities = new ArrayList<>();

		Iterator<String> it2 = cities.iterator();
		while (it2.hasNext()) {
			String city = it2.next();
			if (city.startsWith("A")) {
				removedCities.add(city); // this will get the cities that were removed!
				it2.remove();
			} else
				System.out.print(city + " ");
		}
		System.out.println("\nREMOVED CITIES ARE " + removedCities);
	}

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	

}
