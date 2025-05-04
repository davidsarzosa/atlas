package com.neotech.lesson31;

import java.util.LinkedHashMap;
import java.util.Set;

public class CarModels {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> carlist = new LinkedHashMap<>();
		carlist.put("BMW", 6);
		carlist.put("Lamborghini", 4);
		carlist.put("Masserati", 7);
		carlist.put("Subaru", 1);
		carlist.put("Toyota", 5);
		carlist.put("Audi", 9);

		System.out.println("Car list is:" + carlist.size());
		System.out.println("We have there " + carlist);
		carlist.replace("Audi", 5);
		System.out.println("Car list is:" + carlist.size());
		System.out.println("We have there " + carlist);
		carlist.put("Chevrolet", 2);

		boolean checkHonda = carlist.containsValue("Honda");
		System.out.println("Does this list has brand Honda ? " + checkHonda);

		// carlist.remove("Subaru");
		// arlist.remove(1); // removing by index
		carlist.remove("Subaru");
		System.out.println("Car list is:" + carlist.size());
		System.out.println("We have there " + carlist);

		// Get all models from the map (using keySet() method())
		Set<String> model = carlist.keySet();
		System.out.println("Here are all the models we have  " + model);
		
		
		

	}

}
