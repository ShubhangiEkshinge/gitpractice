package com.testng.annotationsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationDemo {
	public static RemoteWebDriver driver = null;

//	public AnnotationDemo() {
//		this.driver = driver;
//	}

	@BeforeMethod
	public void launchUrl() {
//		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\JARs\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
	}

	@Test
	public void verifyTitleOfHomePage() {
		//WebDriverManager.chromedriver().setup();
		String title = driver.getTitle();
		System.out.println("current Title is:" + title);
	}

	@Test
	public void clickOnMenTab() {
		//WebDriverManager.chromedriver().setup();
		driver.findElement(By.xpath("//a[@title=\"MEN\"]")).click();
	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
