package com.practicepararmeter;

import org.testng.annotations.Test;

public class DependancyDemo {

	@Test(dependsOnMethods = "s12")
	public void s11() {
		System.out.println("s11");
		throw new ArithmeticException();
	}

	@Test()
	public void s12() {
		System.out.println("s12");
	}

	@Test(dependsOnMethods = "s11")
	public void s13() {
		System.out.println("s13");
	}

	@Test(dependsOnMethods = { "s12", "s15" })
	public void s14() {
		System.out.println("s14");
	}

	@Test(dependsOnMethods = { "GroupsDemo.s16" })
	public void s15() {
		System.out.println("s15");
	}

	@Test(alwaysRun = true, dependsOnMethods = "s11")
	public void s16() {
		System.out.println("s16");
	}
}
