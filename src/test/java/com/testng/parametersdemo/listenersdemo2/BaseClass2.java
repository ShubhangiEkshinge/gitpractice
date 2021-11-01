package com.testng.parametersdemo.listenersdemo2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	public static RemoteWebDriver driver;

	@BeforeMethod
	public void setUp2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com");

	}

	@AfterMethod
	public void tearDown2() {
		driver.quit();
	}

}
