package com.testng.annotationsdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Using_TestCaseDemo {

	@Test
	public void s16() {
		System.out.println("I am s16-using @Test");
	}

	@BeforeMethod
	public void s17() {
		System.out.println("I am s17-using @BeforeMethod");
	}

	@AfterMethod
	public void s18() {
		System.out.println("I am s18-using @AfterMethod");
	}

	@Test
	public void s19() {
		System.out.println("I am s19-using @Test");
	}

}
