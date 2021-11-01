package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class InvocationTimeOutDemo {

	@Test(invocationTimeOut = 1000)
	public void m1() {
		System.out.println("i am m1");
	}

	@Test(invocationTimeOut = 2000)
	public void m2() {
		System.out.println("i am m2");
	}

	@Test(invocationTimeOut = 1000)
	public void m3() throws InterruptedException { // expected time
		System.out.println("i am m3");
		Thread.sleep(2000);// actual time
	}

	@Test(invocationTimeOut = 3000, invocationCount = 3) // Excepted Time,we want to execute the one sigle TC 3 times in
															// 3000 miliSeconds
	public void m4() throws InterruptedException {
		System.out.println("I am m4");
		Thread.sleep(3000); // actual time
	}
}
