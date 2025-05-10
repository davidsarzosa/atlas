package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class Homework {

	public static void main(String[] args) throws IOException {
		/*
		 * 
		 *
		 * Homework 1: Create a PROPERTY file to store following configurations:
		 * browser= url= username= password=
		 */

		String urlPath = "/Users/7avids/eclipse-workspace/JavaBasic/configs/url.properties";
		FileInputStream fis = new FileInputStream(urlPath);
		Properties prop = new Properties();
		prop.load(fis);

		Map<Object, Object> sorted = new TreeMap<>(prop);

		for (Map.Entry<Object, Object> entry : sorted.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " " + " Value: " + entry.getValue());
		}

	}

}
