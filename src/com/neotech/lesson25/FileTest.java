package com.neotech.lesson25;

public class FileTest {

	public static void main(String[] args) {

		// File file = new File(); // why ? Abstraction

		File pdf = new PdfFile();
		File java = new JavaFile();

		File[] files = { java, pdf };

		// 2nd Way
		File[] files2 = { new JavaFile(), new PdfFile(), new WordFile() };

		for (File file : files2) {
			file.open(); // this is showing we are using abstraction.
			file.edit(); // this are printing following the loops.
			file.close(); // printing following the loops.

		}
	}

}
