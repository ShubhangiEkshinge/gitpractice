package com.testng.annotationsdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

public class Using_ClasstagDemo extends Using_TesttagDemo{
//We can inherite the testNG's annotaations
//	@Test
//	public void s12() {
//		System.out.println("I am s12-using @Test");
//	}

	@BeforeClass 
	public void s13() {
		System.out.println("I am s13-using @BeforeClass");
	}
//
//	@Test
//	public void s14() {
//		System.out.println("I am s14-using @Test");
//	}

	@AfterClass
	public void s15() {
		System.out.println("I am s15-using @AfterClass");
	}

}
