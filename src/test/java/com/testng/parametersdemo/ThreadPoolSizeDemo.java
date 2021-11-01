package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class ThreadPoolSizeDemo {
	@Test(threadPoolSize = 5000, invocationCount = 10)
	public void shubhnagi() {
		System.out.println("I am shubhangi");
	}

	@Test(threadPoolSize = 1000, invocationCount = 5)
	public void Ekshinge() {
		System.out.println("I am Ekshinge");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
