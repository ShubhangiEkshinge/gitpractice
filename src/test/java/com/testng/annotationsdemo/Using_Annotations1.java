package com.testng.annotationsdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Using_Annotations1 extends Using_Annotation {

	@BeforeSuite
	public void s1() {
		System.out.println("s1 =Before suite");
	}

	@AfterSuite
	public void s2() {
		System.out.println("s2 =After suite");
	}

	@Test
	public void s3() {
		System.out.println("s3 = Test");
	}

	@BeforeMethod
	public void s4() {
		System.out.println("s4 = Before method");
	}

	@AfterMethod
	public void s5() {
		System.out.println("s5 = After method");
	}
}
