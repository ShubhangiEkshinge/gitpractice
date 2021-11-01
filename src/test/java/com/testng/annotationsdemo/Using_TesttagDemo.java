package com.testng.annotationsdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_TesttagDemo {

	@Test
	public void s7() {
		System.out.println("I am s7-using @Test");
	}

	@BeforeTest
	public void s8() {
		System.out.println("I am s8-using @BeforeTest");
	}

	@Test
	public void s9() {
		System.out.println("I am s9-using @Test");
	}

	@AfterTest
	public void s10() {
		System.out.println("I am s10-using @AfterTest");
	}
	@BeforeClass
	public void s11() {
		System.out.println("I am s11-using @BeforeClass");
	}


}
