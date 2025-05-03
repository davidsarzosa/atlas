package com.neotech.lesson30;

public class Student {
	/*
	 * Homework 3: Create a Set collection that will hold Objects of Student Type.
	 * In this set we do not care about the insertion order. Each student object
	 * should have name and studentID. Display name of each student.
	 */

	String name;
	String studentId;

	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	public String toString() {
		return name;

	}

	public String toString1() {
		return studentId;
	}

}
