package com.practicepararmeter;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

//@Test(singleThreaded = true)
public class PararmetersDemo1 {

//	public void method1() {
//		System.out.println("method1");
//		throw new ArithmeticException();
//
//	}

	@Test(invocationTimeOut = 10000, invocationCount = 5)
	public void a1() throws InterruptedException {
		System.out.println("I am a1");
		Thread.sleep(1000);
	}

	@Test(timeOut = 3000) // Expected time
	public void a2() throws InterruptedException {
		System.out.println("I am a2");
		Thread.sleep(4000);// Actual time

	}

	@Test(invocationTimeOut = 2000, invocationCount = 5)
	public void a3() throws InterruptedException {
		System.out.println("I am a3");
		Thread.sleep(1000);
	}

	int count = 0;

	@Test(successPercentage = 60, invocationCount = 5)
	public void a4() throws InterruptedException {
		count++;
		System.out.println("I am a4");
		Assert.assertEquals(count % 2, 0);
		// Thread.sleep(1000);
	}
}
