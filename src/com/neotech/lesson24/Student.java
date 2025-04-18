package com.neotech.lesson24;

public class Student {

	/*
	 * ▪ Create a Class Student that will have 3 subclasses as NeotechStudent,
	 * CollegeStudent, SchoolStudent. ▪ Define common behavior within the parent
	 * class and override some of the methods in the child classes ▪ Define some
	 * methods specific to the child classes ▪ Write an example of achieving run
	 * time polymorphism
	 */

	public void learn() {
		System.out.println("Student is learning");
	}

	protected void homework() {
		System.out.println("Student is doing homework");
	}

}

class NeotechStudent extends Student {

	public void learn() {

		System.out.println("Student learn how to code at NeoTech Academy");
	}

	protected void homework() {
		System.out.println("Student's homework is to code");
	}

	void getjob() {
		System.out.println("Student becomes a QA");
	}

}

class CollegeStudent extends Student {
	public void learn() {
		System.out.println("Student takes multiple classes in College");
	}

	protected void homework() {
		System.out.println("Student have some practical homeworks in College");
	}

}

class SchoolStudent extends Student {

	public void learn() {
		System.out.println("Student learn how to read and talk in School");
	}

}
