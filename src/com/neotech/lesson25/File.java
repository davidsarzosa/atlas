package com.neotech.lesson25;

public abstract class File {

	/*
	 * Create a class File that will have the following behaviors: open(), edit(),
	 * close() Edit() and close() are implemented methods while open() is abstract.
	 * 
	 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
	 * implementation of open() behavior.
	 */

	public abstract void open(); //here we are doing abstraction to later on, override the other methods 
	// in different classes. 

	public void edit() {
		System.out.println("File can be edited! ");
	}

	public void close() {
		System.out.println("File can be closed! ");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open a Java file you need Eclipse! ");
	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open the Word dile you need the Word App");
	}

}

class PdfFile extends File {

	@Override
	public void open() {
		System.out.println("To open the PDF file you need Acrobat Reader ");
	}

}
