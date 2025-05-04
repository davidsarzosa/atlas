package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class personTest {

	public static void main(String[] args) {
		Map<Integer, Person> people = new TreeMap<>();
		people.put(4, new Person("Mario", "Sazosa", 65, 500));
		people.put(1, new Person("Consuelo", "Moya", 66, 600));
		people.put(3, new Person("Mateo", "Espinosa", 25, 1000));
		people.put(12, new Person("Mario", "Sazosa", 27, 2000));

		System.out.println(people);

		Set<Entry<Integer, Person>> allEntries = people.entrySet();
		for (Entry<Integer, Person> entry : allEntries) {
			Integer key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key + " --> " + value.firstName);
			value.printDetails();
			 
		}

	}

}
