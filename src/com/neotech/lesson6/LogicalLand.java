package com.neotech.lesson6;

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
			System.out.println("We found the issue = Manuel");

		} else {
			System.out.println("Wrong person keep trying to find the issue");

		}

		System.out.println("-------------Separation line ----------------");

		String country2 = "Mexico";
		String country = "Ecuador";
		boolean traditionalFood = true;
		double people = 17000000;
		boolean ThirtWorld = true;
		char status = 'C';
		boolean narcos = true;
		boolean hardWorkers = true;
		boolean trashyCountry = true;

		if (country == "Ecuador")
			System.out.println(" We are talking about Ecuador ");
		{

			if (people == 17000000 && traditionalFood && ThirtWorld && hardWorkers) {

				System.out.println("I found an amazing place in the world which is this! ");

			}
			if (country2 == "Mexico" && narcos && traditionalFood && hardWorkers) {
				System.out.println(" This is Mexico ");
			}

		}

	}

}
