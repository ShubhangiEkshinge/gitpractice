package com.testng.parametersdemo.groupsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_GroupsDemo {
	public static RemoteWebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://ijmeet.com/");
		//System.out.println("Launch browser Successfully");
	}

	@Test(groups = "Regression")
	public void verifyTheUrlOfPage() {
		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		// driver.get("https://ijmeet.com/");
		String url = driver.getCurrentUrl();
		System.out.println("current url is:" + url);
	}

	@Test(groups = "Smoke")
	public void clickOnSignInTab() {
		//driver.get("https://ijmeet.com/");
		 driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();
		//driver.findElement(By.xpath("//a[@href=\"https://ijmeet.com/app?csrt=11084643709435451855\"]")).click();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
