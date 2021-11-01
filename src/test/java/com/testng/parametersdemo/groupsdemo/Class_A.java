package com.testng.parametersdemo.groupsdemo;

import org.testng.annotations.Test;

public class Class_A {

	@Test(groups = "Regression")
	public void Test1() {
		System.out.println("I am Test1");
	}

	@Test(groups = "Sanity")
	public void Test2() {
		System.out.println("I am Test2");
	}

	@Test(groups = "Smoke")
	public void Test3() {
		System.out.println("I am Test3");
	}

	@Test(groups = "Sanity")
	public void Test4() {
		System.out.println("I am Test4");
	}

	@Test(groups = "Regression")
	public void Test5() {
		System.out.println("I am Test5");
	}

}
