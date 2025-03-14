package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// how to import the Scanner library:
		// import it using the Java suggestion box
		// or Ctrl + Shift + O, Mac: Cmd + Shift + O

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name");
		String name = input.next(); // It will stop capturing input untill the first space
		System.out.println("Your name is " + name);

		System.out.println("Hold old are you ? ");
		String age = input.next();
		System.out.println("My age is " + age + " years old ");

		System.out.println("It is raining outside ? ");
		boolean Israining = input.nextBoolean();
		System.out.println(Israining);
		{
			if (Israining) {
				System.out.println("Is raining outside, dont forget your umbrela");
			} else {
				System.out.println("It is not raining");
			}

			System.out.println("What is your sallary? ");
		}
		double salary = input.nextDouble();
		System.out.println("My salary is " + salary);

		System.out.println("=============================================");

		Scanner input2 = new Scanner(System.in);

		System.out.println("What is you nationality ?");
		String nationality = input2.next();
		System.out.println("My nationality is " + nationality);
		if (nationality == "Ecuador") {
			System.out.println("Ohhh! wow! the best country in the world!!!! ");
		}else {
			System.out.println("Thi person has no nationality");
		}

		System.out.println("What is your language ? ");
		String language = input.next();
		System.out.println("My language is " + language);
		if (language == "Spanish") {
			System.out.println("Hola como estas yo tambien hablo Espanol! ");
		}

		System.out.println("How old are you ? ");
		int age2 = input.nextInt();
		System.out.println("My age is " + age + "years old");

		if (age2 <= 20) {
			System.out.println("OK Teaaneger!! ");
		}

		System.out.println("Are you currently maried ? ");
		boolean married = !false;
		System.out.println(married);
		if (married) {
			System.out.println("Can I see your ring ? ");
		} else {
			System.out.println("Can I have your phone number");
		}

		System.out.println("Are you currently working ? ");
		boolean job = input2.nextBoolean();
		System.out.println(job);

		if (job) {
			System.out.println("That's amazing! are you a QA ? ");
		} else {
			System.out.println("You need to join Neotech");
		}

	}

}
