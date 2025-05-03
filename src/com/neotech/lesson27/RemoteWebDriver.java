package com.neotech.lesson27;

public interface RemoteWebDriver {

	void navigate();

	public void takePicture();

}

class ChromeDriver implements WebDriver, RemoteWebDriver {

	@Override
	public void navigate() {
		System.out.println("Chrome Driver Navigates");
	}

	@Override
	public void takePicture() {
		System.out.println("Chrome Driver Takes Picture");

	}

	@Override
	public void open() {
		System.out.println("Chrome Driver Opens Driver");

	}

	@Override
	public void close() {
		System.out.println("Chrome Driver Close Driver");

	}

	@Override
	public void getTitle() {
		System.out.println("Chrome Driver Gets Tittle");

	}

}

class FireFoxDriver implements WebDriver, RemoteWebDriver {

	@Override
	public void navigate() {
		System.out.println("FireFox Driver Navigates");
	}

	@Override
	public void takePicture() {
		System.out.println("FireFox Driver Takes Picture");

	}

	@Override
	public void open() {
		System.out.println("FireFox Driver Opens Driver");

	}

	@Override
	public void close() {
		System.out.println("FireFox Driver Close Driver");

	}

	@Override
	public void getTitle() {
		System.out.println("FireFox Driver Gets Tittle");

	}
}

class SafariDriver implements WebDriver, RemoteWebDriver {

	@Override
	public void navigate() {
		System.out.println("Safari Driver Navigates");
	}

	@Override
	public void takePicture() {
		System.out.println("Safari Driver Takes Picture");

	}

	@Override
	public void open() {
		System.out.println("Safari Driver Opens Driver");

	}

	@Override
	public void close() {
		System.out.println("Safari Driver Close Driver");

	}

	@Override
	public void getTitle() {
		System.out.println("Safari Driver Gets Tittle");

	}
}
