package com.neotech.lesson30;

import java.util.HashMap;
import java.util.HashSet;

public class MapIntro {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("Sofia");
		hs.add("David");

		System.out.println("Set " + hs);

		// <K, V> --> a pair --> entry
		// for this HashMap example, key is Integer, and value is String

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Mario");
		map.put(2, "Consuelo");
		map.put(3, "Aleksei");
		System.out.println("Map: " + map);

		// what if I:
		map.put(3, "Maelito"); // update the value for key 2
		System.out.println();
		System.out.println("Map: " + map);

		// keys have to be unique, value can have duplicates
		// keys --> definition of a SET
		// values --> definition of a LIST

		boolean isEmpy = map.isEmpty();
		System.out.println("Is mam empty ? " + isEmpy);

		System.out.println("The size if the map " + map.size());
		// map.put("4", "Anastasia"); We have to use an integer key
		map.put(4, "Logrono");
		map.put(15, "Forlan");
		System.out.println("Map: " + map);

		// key exist -> update, if not just create a new one
		// add a new key pair
		map.put(6, "Matilde");
		map.put(7, "Fabiola");
		System.out.println("Map: " + map); // will update following index order

		// GET VALUES ?
		String map7 = map.get(7);
		System.out.println(map7);

		// REPLACE VALUE
		map.replace(2, "Yolanda");
		System.out.println("Map: " + map);

		// REMOVE AN ENTRY
		System.out.println("Removing by key " + map.remove(7));
		System.out.println("Map: " + map);
		System.out.println("Removing by key and value " + map.remove(6, "Matilde"));

		// CHECKING A KEY IN THE MAP
		boolean containsKey = map.containsKey(15);
		System.out.println("Does contains 15 ? " + containsKey);

		// CHECKING IF A VALUE IS ON THE MAP
		boolean hasvalue = map.containsValue("Yolanda");
		System.out.println("Does the key 2 contains value ? " + hasvalue);

	}

}
