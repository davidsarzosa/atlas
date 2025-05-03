package com.neotech.lesson27;

import java.util.ArrayList;

//public class RECAP {
//
//	public static void main(String[] args) {
//
//		// Wrapper classes
//		// We can convert int, boolean, double, etc into a objects and then use them how
//		// ?
//		// Boxing , Unboxing
//		// examples
//
//		int num = 10;
//		Integer number1 = new Integer(20); // BOXING an int into a Integer object
//
//		int num2 = number1.intValue(); // this is how you get the value/ this is call UNBOXING
//		System.out.println(num2);
//
//		Integer number2 = 40; // AUTO BOXING
//		int num3 = number2; // AUTO BOXING
//
//		// what is the max value we can assigned to an int ?
//		System.out.println(number2.MAX_VALUE);
//		// since they are static
//		System.out.println(number2.MIN_VALUE);
//
//		// FOR BYTES
//
//		byte b1 = 25; // AUTOBOXING
//		System.out.println(b1);
//
//		Double d1 = 5.5;
//		double d2 = d1;
//
//		Character c1 = '&';
//		char c2 = c1;
//
//		Boolean boolean1 = true;
//		boolean boolean2 = boolean1;
//
//		/*
//		 * PRIMITIVE DATATYPE // WRAPPER CLASS
//		 * 
//		 * 
//		 * 
//		 * boolean // Boolean char // Character byte // Byte short // Short int //
//		 * Integer long // Long float // Integer double // Double
//		 * 
//		 * 
//		 * 
//		 * 
//		 * 
//		 */
//
//		System.out.println("------------------------------");
//	}
//
//}

public class RECAPArrayListIntro {

	public static void main(String[] args) {

		int[] numbers = new int[5];
		// we set the size, it is fixed, cannot change

		// The Syntax is
		// ArrayList<String> VariableName = new ArrayList();

		/*
		 * Used methods of Collections interface
		 * 
		 * public boolean add.(object element) public boolean addAll(collection c)
		 * public boolean remove(object element) public boolean remoreAll(Collection c)
		 * public boolean retainAll(Collection c)
		 * 
		 * public int size(object element) public void clear() public void contains
		 * (object element) public void containsAll(collection c) public iterator
		 * iterator()
		 * 
		 */

		ArrayList<String> names1 = new ArrayList();
		System.out.println(names1);

		System.out.println("The size is " + names1.size());
		names1.add("Juan");
		names1.add("Ligia");
		names1.add("Consuelo");
		names1.add("Jorge");
		names1.add("Maelito");

		System.out.println(names1);
		System.out.println("The size is " + names1.size());
		// names.add(3, "Mario");
		// names.remove("Jorge");

		// System.out.println(names.contains("consuelo"));
		System.out.println(names1);

		System.out.println("Iterate using for loop ");

		for (int i = 0; i < names1.size(); i++) {
			System.out.print(names1.get(i) + " ");

		}
		System.out.println();
		System.out.println("------------------------------------------------------------");

		ArrayList<String> lastNames = new ArrayList<>();

		lastNames.add("Sarzosa");
		lastNames.add("Espinosa");
		lastNames.add("Moya");
		lastNames.add("Silva");
		lastNames.add(2, "Chicaiza");
		System.out.println(lastNames);
		lastNames.remove(3);
		lastNames.addFirst("Alekseiva");
		lastNames.size();
		lastNames.remove(0);

		// now we can do a iteration, a normal iteration for lastNames

		for (int i = 0; i < lastNames.size(); i++) {
			if (lastNames.contains("Alekseiva")) {
				System.out.println("This bitch is Russian" + i);
				break;
			}
			System.out.print(lastNames.get(i) + " ");
		}

		// also we can do it with a enhanced for loop

		System.out.println(); // separation line
		for (String ln : lastNames) {
			System.out.print(ln + " ");
		}
		
		
		
		

	}

}
