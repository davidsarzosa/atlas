package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentDisplayDemo {
	public static void main(String[] args) {

		Set<Student> student = new LinkedHashSet<>();
		student.add(new Student("Adrian", "ID01061994"));
		student.add(new Student("Xavier", "ID01061996"));
		student.add(new Student("Josan", "ID01061996"));
		student.add(new Student("Belen", "ID01061997"));
		student.add(new Student("Steven", "ID0106145"));
		student.add(new Student("Josan", "ID01061945"));
		student.add(new Student("Belen", "ID01061989"));
		student.add(new Student("Steven", "ID0106112"));
		student.add(new Student("Camila", "ID01061967"));
		student.add(new Student("Bryan", "ID01061945"));
		student.add(new Student("Alexander", "ID0106196"));

		System.out.println("Using enhanced for loop");
		for (Student name : student) {
			System.out.print(name + " ");
		}

		System.out.println("\nUsing Iterator");
		// we can also use iterator
		Iterator<Student> it = student.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().name.toString() + " ");
			// System.out.println(it.toString());

		}
		System.out.println("\nUsing Iterator for ID's");
		// Using Iterator to print the IDs
		Iterator<Student> itid = student.iterator();
		while (itid.hasNext()) {
			System.out.print(itid.next().studentId.toString() + " ");
		}

	}
}
