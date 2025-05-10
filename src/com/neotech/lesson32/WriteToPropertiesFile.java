package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	// 1 Location ? how to find the location ?
	public static void main(String[] args) throws IOException {

		String filePath = "/Users/7avids/eclipse-workspace/JavaBasic/configs/example.properties";

		// If I start writing on the file I will override the file, so I need to read
		// the file,
		// then I can start writing on the file.

		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();

		// 4. Loading all data from fis file
		prop.load(fis);

		// Lets change some data

		prop.setProperty("name", "Francisco");
		prop.setProperty("lastName", "Aguirre");
		prop.setProperty("salary", "35");
		prop.setProperty("state", "Puembo");
		prop.setProperty("language", "Spanish");

		// Now that I can write
		// To write some data we do need a FileOutputStream
		FileOutputStream ios = new FileOutputStream(filePath);

		// WRITE THE CHANGES TO THE FILE

		prop.store(ios, "We just update the file");

	}

}
