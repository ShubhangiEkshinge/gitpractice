package com.testng.parametersdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnabledDemo {
	public RemoteWebDriver driver;

	@Test(enabled = true) // ByDefault enabled = true
	public void testCase001() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test(enabled = false) // this testCase is not a part of execution
	public void testCase002() {
		driver.close();
	}

}
