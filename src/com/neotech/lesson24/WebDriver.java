package com.neotech.lesson24;

public class WebDriver {

	public void openBrowser() {
		System.out.println("Open Browser! ");
	}

}

class ChromeDriver extends WebDriver {
	public void openBrowser() {
		System.out.println("Open Chrome Browser! ");
	}
}

class FireFoxDriver extends WebDriver {

	public void openBrowser() {
		System.out.println("Open FireFox Browser");
	}

}

class EdgeDriver extends WebDriver {
	public void openBrowser() {
		System.out.println("Open Edge Browser");

	}

}
