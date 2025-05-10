package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		// What do I need first ?

		// 1. Location -- > This is where the file is located

		String filePath = "/Users/7avids/eclipse-workspace/JavaBasic/configs/example.properties";

		// 2. I am reading or writing the file ? -- FileInput || FileOutPut
		FileInputStream fis = new FileInputStream(filePath);

		// This next steps are specific to .properties file type
		// 3. create a properties object.

		Properties prop = new Properties();
		prop.load(fis);

		// Let's read the data
		String name = prop.getProperty("name");
		String lastName = prop.getProperty("lastName");
		String salary = prop.getProperty("salary");
		String state = prop.getProperty("state");
		String language = prop.getProperty("language");
		System.out.println(name + " " + lastName + " " + salary + " " + state + " " + language + " ");

		System.out.println("----------------------------------------");

		Set<Object> keys = prop.keySet();
		Collection<Object> values = prop.values();
		System.out.println(keys);
		System.out.println(values);

		System.out.println("----------------------------------------");

		for (Object key : keys) {
			System.out.println(key);
		}
		System.out.println();
		for (Object value : values) {
			System.out.println(value);
		}

	}

}
