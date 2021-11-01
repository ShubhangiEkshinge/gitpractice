package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class ExpectedExceptionDemo {

	@Test(expectedExceptions = { ArrayIndexOutOfBoundsException.class })
	public void test1() {
		System.out.println("test one");
		throw new ArrayIndexOutOfBoundsException();
	}

	@Test(expectedExceptions = { ArrayIndexOutOfBoundsException.class })
	public void test2() {
		System.out.println("test two");
		throw new ArithmeticException();// failed because expected exception is AIOBE
	}

	@Test(expectedExceptions = { ArrayIndexOutOfBoundsException.class })
	public void test3() {
		System.out.println("test three");// failed becaus expect the exception but it doesn't throw ant exception
	}

}
