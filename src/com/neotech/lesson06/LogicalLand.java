package com.neotech.lesson06;

public class LogicalLand {

	public static void main(String[] args) {

		// declare an integer
		// if the number is between 1 and 10 -> small number
		// if the number is between 11 and 100 -> medium number
		// if the number is between 101 and 1000 -> big number
		// if the number is greater than 1000 -> out of range

		int land = 10000;

		if (land <= 10) {
			System.out.println("Small Number");
		}
		if (land >= 11 && land <= 100) {
			System.out.println("medium number");
		}
		if (land >= 101 && land <= 1000) {
			System.out.println("big number");
		}
		if (land >= 1000) {
			System.out.println("out of range");
		}

		System.out.println("This will be the end of the lane ");

		// lets use a string in our condition block

		String name = "Jhon";
		boolean isMale = true;
		int age = 26;
		char grade = '5';
		boolean smokes = true;
		boolean isTrans = true;
		String name2 = "Manuel";

		if (name == "Jhon" && age == 26 && isMale) {
			System.out.println("I found you ");
		} else {
			System.out.println("Wrong person");
		}

		if (name2 == "Manuel" && smokes && age == 26 && isTrans) {
			System.out.println("We found the mistake, the mistake is Manuel");

		} else {
			System.out.println("Wrong person keep trying to find him ");

		}

		System.out.println("-------------Separation line ----------------");

		// Identify your country!

		boolean traditionalFood = true;
		String people = "17 millones";
		boolean hasGalapagos = true;
		boolean novelas = true;
		boolean mariachis = true;
		boolean hardWorkers = true;
		boolean tacos = true;
		String people1 = "80 millones";
		int ageCountry1 = 250;
		int ageCountry2 = 300;

		if (traditionalFood && people == "17 millones" && hasGalapagos && hardWorkers && ageCountry1 == 250)
			System.out.println(" We are talking about Ecuador ");

		if (tacos && mariachis && novelas && people1 == "80 millones" && ageCountry2 == 300) {
			System.out.println("We are talking about Mexico ");
		}

	}

}
