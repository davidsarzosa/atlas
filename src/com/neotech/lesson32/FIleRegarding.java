package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import java.io.FileInputStream;

public class FIleRegarding {

	public static void main(String[] args) throws IOException {

		String fullPath = "/Users/7avids/eclipse-workspace/JavaBasic/configs/example.properties";

		// Find the user directory

		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);

		// Fin the userName
		String userName = System.getProperty("user.name");
		System.out.println(userName);

		// get the os info
		String os = System.getProperty("os.name");
		System.out.println(os);

		System.out.println("-------------------------");

		// we can create a dynamic path

		String dynamicPath = System.getProperty("user.dir") + "/configs/config.properties";
		System.out.println(dynamicPath);

		FileInputStream fis = new FileInputStream(dynamicPath);

		Properties prop = new Properties();
		prop.load(fis);

		// Now i have read the file and loaded all the data in the project

		String url = prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("browser"));

		String name = prop.getProperty("name");
		System.out.println(name);

	}

}