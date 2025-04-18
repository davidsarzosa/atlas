package com.neotech.lesson24;

public class WebDriverTest {

	public static void main(String[] args) {

		// we're using runtime polymorphism to create objects
		// the browser that is called depends on the object created

		WebDriver driver = new ChromeDriver();
		driver.openBrowser(); // overriding

//		WebDriver Fdriver = new FireFoxDriver();
//		Fdriver.openBrowser(); // overriding
//
//		WebDriver Edriver = new EdgeDriver();
//		Edriver.openBrowser(); // overriding
		

	}
}
