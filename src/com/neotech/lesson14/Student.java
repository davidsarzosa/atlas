package com.neotech.lesson14;

public class Student {

	// features: studentID, name, lastName, age, school, grade
	// behaviors : study(), doHomework():

	String studentID = "4488";
	String name = "Adrian";
	String lastName = "Espinosa";
	int age = 30;
	String school = "Neotech";
	char grade = 'A';

	// this is the behaviors
	void study() {
		System.out.println(name + " " + lastName + " " + " Studies Java! ");
	}

	void doHomework() {
		System.out.println(name + " does write code as a homework every nigth! ");
	}

	void grade() {
		System.out.println(name + " has this grade " + grade);
	}

}
