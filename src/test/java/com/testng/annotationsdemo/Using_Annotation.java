package com.testng.annotationsdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_Annotation {

	@Test
	public void m1() {
		System.out.println("m1 = test");
	}

	@BeforeTest
	public void m2() {
		System.out.println("m2 = Before test");
	}

	@AfterTest
	public void m3() {
		System.out.println("m3 = After test");
	}

	@BeforeClass
	public void m4() {
		System.out.println("m4 = Before class");
	}

	@AfterClass
	public void m5() {
		System.out.println("m5 = After class");
	}
}
