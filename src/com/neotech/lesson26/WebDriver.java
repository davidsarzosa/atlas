package com.neotech.lesson26;

public interface WebDriver {
	/*
	 * Homework 1: Create a WebDriver Interface that will have the following
	 * unimplemented behavior: openBrowser(), closeBrowser(), maximizeWindow(),
	 * findElement().
	 * 
	 * Create another interface named Camera that will have the method:
	 * takePicture(); Create 2 classes that implements WebDriver and Camera
	 * interfaces: ChromeDriver and FirefoxDriver.
	 */

	// In Interfaces : 100% abstraction
	// - No instance variables
	// - No constructor
	// - No implemented methods

	// In Interfaces
	// - All the variables are public static final
	// - All the methods are public abstract

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();

}

interface Camera {

	void takePicture();

}

class ChromeDriver implements WebDriver, Camera {

	String driver = "Chrome Driver";

	@Override
	public void takePicture() {
		System.out.println(" take picture using " + driver);

	}

	@Override
	public void openBrowser() {
		System.out.println(" open browser using " + driver);
	}

	@Override
	public void closeBrowser() {
		System.out.println(" close browser using " + driver);

	}

	@Override
	public void maximizeWindow() {
		System.out.println(" maximize the browser using " + driver);

	}

	@Override
	public void findElement() {
		System.out.println(" find elements using " + driver);
	}

}

class FireFoxDriver implements WebDriver, Camera {
	String driver = "FireFox Driver";

	@Override
	public void takePicture() {
		System.out.println(" take picture using " + driver);
	}

	@Override
	public void openBrowser() {
		System.out.println(" open browser using " + driver);

	}

	@Override
	public void closeBrowser() {
		System.out.println(" close browser using " + driver);

	}

	@Override
	public void maximizeWindow() {
		System.out.println(" maximize window using " + driver);

	}

	@Override
	public void findElement() {
		System.out.println(" find element using  " + driver);

	}

}
