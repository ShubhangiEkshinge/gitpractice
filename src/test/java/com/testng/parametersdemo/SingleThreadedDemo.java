package com.testng.parametersdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleThreadedDemo {
	int count = 0;

	@Test(singleThreaded = true)
	public void m50() {
		System.out.println("I am m50");
	}

	@Test(singleThreaded = true)
	public void m100() {
		count++;
		System.out.println("verifying count:" + count);
		Assert.assertTrue(count % 2 == 0);

	}
}
