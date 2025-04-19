package com.neotech.lesson26;

public class WebDriverTest {
	public static void main(String[] args) {

		FireFoxDriver firefox = new FireFoxDriver();
		firefox.takePicture();
		firefox.openBrowser();
		firefox.closeBrowser();
		firefox.maximizeWindow();
		firefox.findElement();

		ChromeDriver chrome = new ChromeDriver();

		chrome.takePicture();
		chrome.openBrowser();
		chrome.openBrowser();
		chrome.closeBrowser();
		chrome.maximizeWindow();
		chrome.findElement();

		WebDriver driver = new FireFoxDriver();

		driver.openBrowser();
		driver.closeBrowser();
		driver.maximizeWindow();
		driver.findElement();

		// driver.takePicture(); takePicture() exist only in takePicture class

		WebDriver driver2 = new ChromeDriver();
		driver2.openBrowser();
		driver2.closeBrowser();
		driver2.maximizeWindow();
		driver2.findElement();

		// driver2.takePicture(); takePicture() exist only in takePicture class

		Camera cam = (Camera) driver;
		cam.takePicture();

		// cam.closeBrowser(); You can not access to this type because its a Camera
		// Type()

		// ChromerDriver cd = (ChromeDriver) driver;

		// driver.closeBrowser();
		
		

	}

}
