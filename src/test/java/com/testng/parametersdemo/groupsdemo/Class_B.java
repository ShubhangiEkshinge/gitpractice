package com.testng.parametersdemo.groupsdemo;

import org.testng.annotations.Test;

public class Class_B {

	@Test(groups = "owntest")
	public void testClass1() {
		System.out.println("testClass1");
	}

	@Test(groups = "newtest")
	public void testClass2() {
		System.out.println("testClass2");
	}

	@Test(groups = "newtest")
	public void testClass3() {
		System.out.println("testClass3");
	}

	@Test(groups = "owntest")
	public void testClass4() {
		System.out.println("testClass4");
	}
}
