package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test() // ByDefault invocationCount is 1
	public void zerothTest() {
		System.out.println("zeroth test");
	}

	@Test(invocationCount = 1) // always invocationCount is greater than zero(invocationCount>0)
	public void firstTest() {
		System.out.println("first test");
	}

	@Test(invocationCount = 0) // If we provide invocationCount is= 0 that TC is not the part of execution
	public void secondTest() {
		System.out.println("second test");
	}

	@Test(invocationCount = 4) // this TC execute the 4 times becuase of the invocationCount is 4
	public void thirdTest() {
		System.out.println("third test");
	}

	@Test(invocationCount = -2) // If we provide invocationCount is= 0 or -ve then that TC is not the part of
								// execution
	private void fourthTest() {
		System.out.println("fourth test");
	}

	@Test(invocationCount = 1)
	public void fifthTest() {
		System.out.println("fifth test");
	}

}
