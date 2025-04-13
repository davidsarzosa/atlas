package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {

		// creating an object using the default constructor

		Student st1 = new Student();

		st1.displayInfo(); // printing null ?

		st1.adress = "Puembo Florencio Espinosa E4-93";
		st1.name = "David Alejandro Sarzosa Moya";

		st1.displayInfo();

		System.out.println("--------------------");

		Student st2 = new Student("Andrea", "Puembo Florencio Espinosa E4-93");
		st2.displayInfo();
		st2.adress = "BOG";
		st2.displayInfo();

		// HOW does Java tells which constructor you are using ?
		// Based on the constructor signature

		Student st3 = new Student("Paola", 35, "Boronesh, Russia");
		st3.displayInfo2();

	}

}
