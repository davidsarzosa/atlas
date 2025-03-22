package com.neotech.lesson14;

public class School {
	public static void main(String[] args) {

		// ClassName identifier = New ClassNmae();

		Student s1 = new Student();

		s1.name = "Juan";
		s1.studentID = "5678";
		s1.lastName = "Moya";
		s1.age = 65;
		s1.school = "UCE";
		s1.grade = 'C';

		s1.study();
		s1.doHomework();
		s1.grade();

		System.out.println();
		Student s2 = new Student();

		s2.name = "Pedro";
		s2.studentID = "980";
		s2.lastName = "DiMaria";
		s2.age = 56;
		s2.school = "PUCE";
		s2.grade = 'D';

		s2.study();
		s2.doHomework();
		s2.grade();

		// s1.study();

	}

}
