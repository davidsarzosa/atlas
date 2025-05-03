package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Iterator;

public class Task1 {

	/*
	 * 
	 * Create a map of a building. Store floor number and its associated company
	 * name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). Insert 5 entries with
	 * duplicate keys and values. - Check how many entries you have? - Update
	 * company on a 4th floor - Remove company on the 3th floor - Print your map
	 */
	public static void main(String[] args) {

		HashMap<Integer, String> building = new HashMap<>();

		// Mapping depends on what you are dealing with
		// Character, String
		// String Integer
		// Integer, Student
		// String, String

		building.put(1, "Amazon");
		building.put(2, "Amazon");
		building.put(3, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "Amazon");
		building.put(6, "Google");
		building.put(7, "Opera");
		building.put(8, "Microsoft");
		building.put(9, "Nokia");
		building.put(10, "Zoom");
		System.out.println("The size of the building is " + building.size());
		System.out.println("Building has  " + building);
		building.replace(4, "Oracle");
		building.remove(3);
		System.out.println("Building has  " + building);
		if (building.containsKey(1) || (building.containsKey(2)) || (building.containsKey(3))
				|| (building.containsKey(4))) {
			building.replace(1, "Lenovo");
			building.replace(2, "Atlasian");
			building.replace(3, "Toast");
			building.replace(4, "MonkeyPlus");

		} else {
			System.out.println("Nothing to replace here");
		}
		System.out.println("Building has  " + building);

	}

}
