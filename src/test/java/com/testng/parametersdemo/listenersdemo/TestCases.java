package com.testng.parametersdemo.listenersdemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListeners.class)
public class TestCases extends BaseClass { // extends because we want to lauch browser before every TC

	@Test
	public void t1() {
		System.out.println("test Case 1");
	}

	@Test
	public void t2() {
		// System.out.println("test Case 2 ");
		throw new AssertionError();
	}

	@Test
	public void t3() {
		System.out.println("test Case 3");
	}

	@Test
	public void t4() {
		System.out.println("test Case 4");
	}
}