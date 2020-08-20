package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSeleniumScript {

	@Test
	public void seleniumScript() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		
		System.out.println("The scripts is running....");
		driver.close();
	}
}