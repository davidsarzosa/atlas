package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class HomeWorkByShane {

	/*
	 * Create a Property file to store following configurations: browser= url =
	 * username = password =
	 * 
	 */

	public static void main(String[] args) throws IOException {

		// Create the path
		// String filePath =
		// "/Users/7avids/eclipse-workspace/JavaBasic/configs/homework"
		// Having the full path hard-coded is NOT good practice since
		// other people form your team might run the code

		// to avoid this problem: we have to use dynamic location

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "/configs/homework.properties";
		System.out.println(filePath);

		// Lets create a FileInputStream object to read the file
		FileInputStream fis = new FileInputStream(filePath);

		// Load the data from the Stream
		Properties props = new Properties();
		props.load(fis);

		// What do we have in our properties file
		System.out.println(props);

		// Lets get the value of browser (Key)
		String browser = props.getProperty("browser");
		System.out.println(browser);

		// Lets get all the values
		Set<Object> keys = props.keySet();
		System.out.println();
		for (Object key : keys) {
			System.out.println(key + "--> " + props.get(key));
		}

		// Lest get all the values
		System.out.println("----------Selenium Steps--------------");
		System.out.println("I am opening the browser " + props.getProperty("browser"));
		System.out.println("I am navigating to this url " + props.getProperty("url"));
		System.out.println("I will enter username " + props.getProperty("username"));
		System.out.println("I will enter password " + props.getProperty("password"));

		// how do I add a new key value pair (property) to the file
		// lets create our new property
		props.setProperty("phoneNumber", "099 8184 264");

		// we need FileOutputStream to write to the file
		FileOutputStream fos = new FileOutputStream(filePath);
		props.store(fos, "Added phone property");

	}

}
