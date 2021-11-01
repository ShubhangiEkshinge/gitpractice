package com.testng.annotationsdemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Using_SuiteDemo {

	
	@Test
	public void s3() {
		System.out.println("I am s3-using @Test");
	}
	
	@BeforeSuite
	public void s4() {
		System.out.println("I am s4-using @BeforeSuite");
	}
	
	@Test
	public void s5() {
		System.out.println("I am s5-using @Test");
	}
	
	@AfterSuite
	public void s6() {
		System.out.println("I am s6-using @AfterSuite");
	}
}
