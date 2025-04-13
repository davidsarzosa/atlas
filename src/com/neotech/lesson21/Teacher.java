package com.neotech.lesson21;

public class Teacher {

//	Write a Java program called Teacher.
//	Specify features and behavior of the Teacher class.
//	Create 3 sub classes MathTeacher, ChemistryTeacher and 
//	PianoTeacher that will also have their own features and behavior.
//	Test all 3 classes.

	int age, yearsOfExperience;
	String name, lastName;
	char gender;

	public void teaches() {
		System.out.println(name + " is a teacher! ");
	}

}
