package com.neotech.lesson18;

public class Student {

//	Create a Class called Students 
//	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
//	▪ Create three objects of the Students Class
//	▪ Set the value for studentName, studentID and increment
//	the numberOfStudents for each object
//	▪ Print out total the number of students

	String studentName;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {

		Student student1 = new Student(); // Object of the Student class
		student1.studentName = "Armando";
		student1.studentID = 49;
		student1.numberOfStudents++;

		Student student2 = new Student(); // Object of the student class
		student2.studentName = "Rodrigo";
		student2.studentID = 95;
		student2.numberOfStudents++;

		Student student3 = new Student(); // Object of the student class

		student3.studentName = "Esperanza";
		student3.studentID = 60;
		student3.numberOfStudents++;

		System.out.println(numberOfStudents);
		

	}

}
