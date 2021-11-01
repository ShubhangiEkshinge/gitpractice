package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class TimeOutDemo {

	@Test(timeOut = 1000)
	public void m11() {
		System.out.println("I am m11");
	}

	@Test(timeOut = 1000) //expected time
	public void m12() throws InterruptedException {
		System.out.println("I am m12");
		Thread.sleep(2000); //actual time
	}

	@Test(timeOut = 2000, invocationCount = 5) // expected time
	public void m13() throws InterruptedException {
		System.out.println("I am m13");
		Thread.sleep(3000);// actual time
	}

}
