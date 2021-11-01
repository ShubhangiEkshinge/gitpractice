package com.testng.parametersdemo.groupsdemo;

import org.testng.annotations.Test;

public class Class_C {

	@Test(groups = "testData")
	public void m1() {
		System.out.println("I am m1");
	}

	@Test(groups = "testData")
	public void m2() {
		System.out.println("I am m2");
	}

	@Test(groups = "testData")
	public void m3() {
		System.out.println("I am m3");
	}
}
