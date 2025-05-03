package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework3 {

	// Create a Set collection that will hold Objects of Student Type.
	// In this set we do not care about the insertion order.
	// Each student object should have name and studentID.
	// Display name of each student.
	public static void main(String[] args) {

		Set<Estudiante> estudiante = new LinkedHashSet<>();
		// estudiante.add("Eugenio");
		Estudiante s1 = new Estudiante("Pablo", 150);
		estudiante.add(s1);
		estudiante.add(new Estudiante("Adrian", 240));
		estudiante.add(new Estudiante("Dennis", 320));
		estudiante.add(new Estudiante("Mateo", 101));
		estudiante.add(new Estudiante("Adrian", 102));
		estudiante.add(new Estudiante("Paola", 103));

		// Using for loop to print values
		for (Estudiante es : estudiante) {
			System.out.print(es.getName() + "/");
			System.out.print(es.getStudentID() + " - ");
		}
		System.out.println("\n---------------------------");
		System.out.println("Names using Iterator:");
		// Using Iterator
		Iterator<Estudiante> ie = estudiante.iterator();
		while (ie.hasNext()) {
			System.out.print(ie.next().toString() + " ");
		}
		System.out.println("\nID using Iterator:");
		Iterator<Estudiante> iid = estudiante.iterator();
		while (iid.hasNext()) {
			System.out.print(iid.next().getStudentID() + " ");
		}

	}
}

class Estudiante {

	// Parametrized constructor --
	// I want every student created to have a name an an id
	// the constructor will set the values
	// the variables will be initialized on object creation

	// this information should be private, SETTERS AND GETTERS ARE REQUIRED
	private String name;
	private int id;

	Estudiante(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Getters: No arguments, return soemthing (data-type depends on what we return
	public String getName() {
		return name;
	}

	// Getter for Student
	public int getStudentID() {
		return id;

	}

	// SETTERS: has arguments, no return type
	public void setName(String Name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
