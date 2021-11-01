package com.testng.parametersdemo.listenersdemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

  @Listeners(MyListenersDemo.class)
  public class TestClassDemo {

	@Test
	public void x1() {
		System.out.println("x1 here");
	}

	@Test
	public void x2() {
		System.out.println("x2 here");
	}

	@Test
	public void x3() {
		System.out.println("x3 here");
	}

}
