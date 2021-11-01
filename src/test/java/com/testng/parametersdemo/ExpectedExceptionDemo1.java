package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class ExpectedExceptionDemo1 {

	@Test(expectedExceptions = ArithmeticException.class)
	public void shubhangi() {
		System.out.println("I am shubhangi");
		// throw new ArrayIndexOutOfBoundsException();
		throw new ArithmeticException();
	}

}
