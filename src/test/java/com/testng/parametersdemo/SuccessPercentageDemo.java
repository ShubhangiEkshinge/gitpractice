package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class SuccessPercentageDemo {

	@Test(successPercentage = 50, invocationCount = 5) // ByDefault successPercentage is 100%
	public void s11() {
		System.out.println("I am s11");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(successPercentage = 30, invocationCount = 4)
	public void s12() {
		int count = 1;
		if (count % 2 == 0) {
			System.out.println("I am s12");
		} else {
			throw new ArithmeticException();
		}
		count++;
	}

}
