package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test // byDefault priority is zero if we don't provide
	public void m0() {
		System.out.println("Zero priority Test cases");
	}

	@Test(priority = -1) //first execute this TC because of -1<0<1
	public void m4() {
		System.out.println("-ve priority Test cases");
	}

	@Test(priority = 1)
	public void m1() {
		System.out.println("First priority Test cases");
	}

	@Test(priority = 2)
	public void s2() {
		System.out.println("second priority Test Case");
	}

	@Test(priority = 2) // when we provide same priority of two test cases that time test case execute
						// by alphabetically
	public void m3() {
		System.out.println("same priority Test Case");
	}

}
