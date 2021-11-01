package com.testng.parametersdemo.listenersdemo1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListenerClass1.class)
public class TestClass1 extends BaseClass1 {

	@Test
	public void m1() {
		System.out.println("I'm m1");
	}

	@Test
	public void m2() {
		// System.out.println("I'm m2");
		throw new AssertionError();
	}

	@Test
	public void m3() {
		System.out.println("I'm m3");
	}

	@Test
	public void m4() {
		System.out.println("I'm m4");
	}
}
