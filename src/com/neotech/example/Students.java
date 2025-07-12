package com.neotech.example;

public class Students {

	/////////////////////////
	String name;
	int age;
	String lastName; // All this are instance variables
	/////////////////////////

	static String School = "Neotech"; // this is share among the variables/objects

	

}

class Student extends Students {
	public static void main(String[] args) {

		Students s1 = new Student();
		
		s1.age = 34;
		s1.lastName = "Putin";
		
		// The static belongs to the class, do not belongs to the object so we need to call the class name 
		
		System.out.println("School before " + School);
		School = "FE Y ALEGRIA";
		System.out.println("School after " + School);

		
		
//		System.out.println("asjhdabskjfsdbf");
//		

	}
 }


