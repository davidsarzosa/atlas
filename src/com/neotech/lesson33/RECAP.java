package com.neotech.lesson33;

public class RECAP {

	public static void main(String[] args) {

		// Lesson RECAP
		// -- > We can read files with java, READ & WRITE is allowed
		// --> Using FileInputStream we can read
		// --> Using FileOutputStream we can write the files
		// --> The steps are

		// 1. We need to find the location of the file and then we need to create an
		// Object of it to it.
		// 2. We need to create a path, PATHS can be projectFile and the other can be
		// filePath
		// This way if someone is trying to read the file they will be able to.
		// Example of the projectFile --> System.getProperty("user.dir");
		// Example of the filePath --> String filePath = "filePath properties location
		// 3 Ones we have connection then we can make the system talk
		// We can create a FileInputStream OBJECT to read the file --> FIS
		// WE can create FileOutputStream OBJECT to write the file -- > FOS

		// LOAD the data from the Stream --> Properties props = new Properties();
		// Then we can load then data --> props.load(); props.load(); props.load();
		// props.load();
		// props.loads(fis);
		// --> this means loading the data of (fis), opening the tunnel with the
		// FileInputStream();
		
		// System.out.println(props); --> you can also print the prop. 
		// props.keySet(); -- > this will let you do this --> 
		// String browser = props.getProperty("browser");
		// System.out.println(browser);
		
	}

}
