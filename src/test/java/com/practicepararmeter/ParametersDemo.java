package com.practicepararmeter;

import org.testng.annotations.Test;

public class ParametersDemo {

	@Test(enabled = true)
	public void m1() {
		System.out.println("I am m1");
	}

	@Test(enabled = false)
	public void m2() {
		System.out.println("I am m2");
	}

	@Test(priority = 0)
	public void m3() {
		System.out.println("I am m3");
	}

	@Test(priority = 1)
	public void a1() {
		System.out.println("I am a1");
	}

	@Test(priority = -1)
	public void m4() {
		System.out.println("I am m4");
	}

	@Test(invocationCount = 3)
	public void m5() {
		System.out.println("I am m5");
	}

}
