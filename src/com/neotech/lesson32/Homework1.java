package com.neotech.lesson32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {

	/*
	 * Homework 1: Create a Map that will store Employee name and salary. Write a
	 * logic to retrieve an employee who gets the highest salary. Output should be
	 * in the below format - John Smith=$100000
	 */

	public static void main(String[] args) {

		Map<String, Integer> employee = new LinkedHashMap<>();

		employee.put("Jorge Espinoza", 10000);
		employee.put("Mario Sarzosa", 150000);
		employee.put("Consuelo Moya", 250000);
		employee.put("Helena Jaramillo", 40000);
		employee.put("Ligia Moya", 500000);
		employee.put("Dany Moya", 1000000);

		System.out.println(" The size of the employee list is ---> " + employee.size());
		System.out.print(employee);
		System.out.println("\n============USING ITERATOR ================");

		Set<String> names = employee.keySet();
		Iterator<String> itEmp = names.iterator();
		while (itEmp.hasNext()) {
			String person = itEmp.next();
			Integer salaryPerson = employee.get(person);
			System.out.println(person + " <--> " + salaryPerson);
		}

		System.out.println("----------------------------");

		// HOW TO FIND THE BIGGEST SALARY -- >
		// COLLECTION can help getting the salary for this
		Collection<Integer> salaries = employee.values();
		int max = 0;

		for (int s : salaries) {
			if (s > max) {
				max = s;
			}
		}
		System.out.println("The highest salary is " + max);
		System.out.println("----------------------------");

		// Putting this in a SET
		// Set<Map<String, Value>> entrySet = employees.entrySet();
		Set<Entry<String, Integer>> entrySet = employee.entrySet();

		// IMPORTANT
		// Result is different -->
		// {} This IS FOR A MAP
		// [] THIS IS A SET
		System.out.println(employee);
		System.out.println(entrySet);
		System.out.println();

		// SECOND WAY
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		// Iterator<Entry<String, Integer>> it = employee.entrySet().iterator();
		Entry<String, Integer> maxEntry = it.next();

		// loop through the other entries
		// compare the salaries (values ) and then update the maxEntry
		while (it.hasNext()) {

			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}

		System.out.println("The highest is : " + maxEntry.getKey() + " - " + maxEntry.getValue());

		// This task can be done using keys as well

	}

}
