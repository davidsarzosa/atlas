package com.neotech.lesson10;

import java.util.Scanner;

public class chatGptLoginSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String dbUser = "daalejandrosm";
		String dbPassword = "odessa.2015";
		String user;
		String password;
		int attempts = 3;

		do {
			System.out.println("Enter User ID and Password");
			user = scan.next();
			password = scan.next();
			if (user.equals(dbUser) && password.equals(dbPassword)) {

				System.out.println("You hace access! ");

				break;
			} else {
				attempts--;
				System.out.println("incorrect credentials. You have 2 more attemps " + attempts);

			}

		} while (attempts > 0);

		if (attempts == 0) {
			System.out.println("You are blocked");
		}

		scan.close();

	}

}
