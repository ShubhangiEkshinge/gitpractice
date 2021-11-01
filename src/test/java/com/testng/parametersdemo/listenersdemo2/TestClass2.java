package com.testng.parametersdemo.listenersdemo2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListenerClass2.class)
public class TestClass2 extends BaseClass2 {

	@Test
	public void case1() {
		System.out.println("case1");
	}

	@Test
	public void case2() {
		System.out.println("case2");
	}

	@Test
	public void case3() {
		System.out.println("case3");
	}

	@Test
	public void case4() {
		// System.out.println("case4");
		throw new AssertionError();
	}

}
