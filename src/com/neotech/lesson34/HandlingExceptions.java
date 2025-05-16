package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingExceptions {

	public static void main(String[] args) {

		String path = "";

		try {
			FileInputStream fis = new FileInputStream(path);

		}

		catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("FileNotFoundException caught!! ");

		}

		System.out.println("End of code! ");

		// There are 2 ways to handle exceptions:
		// 1. We could say and throws declaration on the method that includes them
		// - You are passing the responsibility to whoever uses the method
		// 2. Handle it properly with try and catch
		

	}

}
