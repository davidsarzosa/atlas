package com.neotech.lesson16;

public class recapPractice {

	public static void main(String[] args) {

		// Lets do a recap of all the methods and all the idfferente classes we can do
		// with Java Methods
		// Lets also remember this is only for strings

		int a = 5;

		String name = "Emanuel"; // this is for a pool
		String name2 = new String("Camila"); // JVM reference every time that we are creating a String

		int size = name.length();
		int size2 = name2.length();
		System.out.println("And of course --> size --> " + size + " size2 --> " + size2);
		System.out.println("--------------------------------------");

		String school = "Fe y Alegria";
		System.out.println("School length is --> " + school.length());
		String school2 = "				Fe y Algria 			";
		System.out.println("The length of the school2 String is --> " + school2.length());
		System.out.println("--------------------------------------");

		String city = "New York";
		String loweCaseCity = city.toLowerCase();
		System.out.println("Just one step toWolerCase()" + loweCaseCity);
		System.out.println("--------------------------------------");

		System.out.println("Just one step with toUpperCase() " + city.toUpperCase());
		System.out.println("--------------------------------------");

		System.out.println(city);
		city = "new york city"; // this is a new string I did not change the value of String(city)
		System.out.println(city);
		System.out.println("--------------------------------------");

		String newCity = "New York"; //
		System.out.println(newCity);
		System.out.println("--------------------------------------");

		String sentence = "The size if " + school + " is " + school.length();
		System.out.println(sentence);
		System.out.println("--------------------------------------");

		String firstName = "Mario";
		String lastName = "Sarzosa Jaramillo";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		System.out.println("--------------------------------------");

		String fullName2 = firstName.concat(lastName);
		System.out.println(fullName2);
		System.out.println("--------------------------------------");

		String methodChaining = firstName.concat(" ").concat(lastName).concat(" ").concat(school).toUpperCase();
		System.out.println(methodChaining);
		System.out.println("--------------------------------------");

		String str = " ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println("--------------------------------------");

		String str2 = "						Today is Wendsday, we keep practicing 			good stuff!!	"
				+ "		AND THIS WILL CONTINUE DONT WORRIES 				!!! ";

		System.out.println(str2.trim()); // this will remove unnecessary spaces at the beginning!
		// useful
		System.out.println(str2);
		System.out.println("--------------------------------------");

		System.out.println("length of the str2 is " + str2.length());
		System.out.println("length of the str2.trim() is --> " + str2.trim().length());
		System.out.println("--------------------------------------");

		int[] num = { 1, 2, 3, 4, 5, 6, };
		System.out.println("The array length is : " + num.length); // this is property of the arrays

		System.out.println();
		System.out.println("--------------Different class same lesson ---------------");
		System.out.println();

		// contains()

		String sentence1 = "Hope you are not gay today! ";
		boolean response = sentence1.contains("gay");
		System.out.println("Is Luis Lopez gay ? " + response);
		System.out.println("--------------------------------------");

		// How would I check if i want to ignore case with UPPER in one line ?
		System.out.println(sentence1.toUpperCase().contains("GAY"));
		System.out.println("--------------------------------------");

		// equals()
		String s1 = "Friday";
		String s2 = "friday";
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		System.out.println("-----------------");

		// equalsIgnoreCase()
		System.out.println(s1 + " " + s2);
		boolean equals2 = s1.equalsIgnoreCase(s2);
		System.out.println(equals2);
		System.out.println("--------------------------------------");

		// instead of equalsIgnoreCase(), I could do this:

		boolean equalsUsingLower = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println(s1 + " " + s2);
		System.out.println(equalsUsingLower);
		System.out.println("--------------------------------------");

		// StarsWith();

		boolean starsWith = sentence1.startsWith("Hope");
		System.out.println(starsWith);
		System.out.println("-----------------");

		boolean endsWith = sentence1.endsWith("today! ");
		System.out.println(endsWith);

		System.out.println("--------------------------------------");

		System.out.println();
		System.out.println("--------------Different class same lesson ---------------");
		System.out.println("------------- VERY IMPORTANT METHODS  -------------------");

		System.out.println();

		String name3 = "Consuelo";
		char letter = name3.charAt(0);
		System.out.println("The first letter is " + letter);
		System.out.println("--------------------------------------");

		// indexOf() and lastIndexOF();

		int index = name3.indexOf('T');
		System.out.println(index); // This will print -1 because the char('T') is not in Consuelo
		System.out.println("---------------------");

		String name4 = "Mateo";
		System.out.println("The index of e is: " + name4.indexOf('e'));
		System.out.println("---------------------");

		// same way, I could look for a String (not a letter)
		System.out.println("the index of te is " + name4.indexOf("te"));
		System.out.println("---------------------");
		System.out.println("--------------------------------------");

		String message = "Today we are flying";
		String subStr = message.substring(9); // this will count from index 9 till the end
		System.out.println(subStr);
		System.out.println("--------------------------------------");

		String subStr2 = message.substring(0, 10);
		System.out.println(subStr2); // this is giving us the string from index 0 to index 10;
		System.out.println("--------------------------------------");

		// How can i get "today we are" from this String ?
		String subStr3 = message.substring(0, 12);
		System.out.println(subStr3);
		System.out.println("--------------------------------------");

		System.out.println();
		System.out.println("--------------Different class same lesson ---------------");
		System.out.println("--------------Singular Expressions  ---------------");
		System.out.println();

		String saludar = "Buenas Tardes";
		// how to replace letters
		// replace();

		String nuevoSaludo = saludar.replace('e', 'E');
		System.out.println(saludar);
		System.out.println(nuevoSaludo);
		System.out.println("--------------------------------------");

		String nuevoSaludo2 = saludar.replace("Tardes", "Noches");
		System.out.println(saludar);
		System.out.println(nuevoSaludo2);
		System.out.println("--------------------------------------");

		// REGULAR EXPRESSION
		String combinacion = "Mi numero de telefono es # 737-295-6479";
		System.out.println(combinacion);
		System.out.println("--------------------------------------");

		String combinacion1 = combinacion.replaceAll("[0-9]", "*");
		System.out.println(combinacion1);
		System.out.println("--------------------------------------");

		String combinacion2 = combinacion.replaceAll("[A-Z]", "+");
		System.out.println(combinacion2);
		System.out.println("--------------------------------------");

		String combinacion3 = combinacion.replaceAll("[a-zA-Z]", "+");
		System.out.println(combinacion3);
		System.out.println("--------------------------------------");

		// This will be the opposite
		// [0-9 ] replace all numbers 0-9
		// [^0-9] replace everything else but the number 0-9

		String combinacion4 = combinacion.replaceAll("[^0-9]", "");
		System.out.println(combinacion4);
		System.out.println("--------------------------------------");

		String combinacion5 = combinacion.replaceAll("[^0-9]", "=");
		System.out.println(combinacion5);
		System.out.println("--------------------------------------");

		String combinacion6 = combinacion.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(combinacion6);

		System.out.println("--------------------------------------");
		// Here is an Exercise for Student so we need to be inside the main method
		// to be able to access the method I need a student object

		Student st = new Student();
		System.out.println("The student grade is " + st.getGrade(81));// you can do it with one step.
		System.out.println("--------------------------------------");

		// Also you can create a second student
		Student st2 = new Student();
		System.out.println("The 2nd student's grade is " + st2.getGrade(65));

	}

// this is for the class Student, we need to create a method getGrade()
	/*
	 * Create a class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score > 80 -
	 * B score > 70 - C score > 50 - D anything else - F
	 * 
	 */

	char getGrade(int score) {
		char grade;
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

}
