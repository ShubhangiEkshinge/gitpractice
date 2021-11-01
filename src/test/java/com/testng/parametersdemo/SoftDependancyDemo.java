package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class SoftDependancyDemo {

	@Test(dependsOnMethods = "m12")
	public void m11() {
		System.out.println("I am m11");// Is it become the part of the execution(It is skip)
	}

	@Test
	public void m12() {
		System.out.println("I am m12");
		throw new ArithmeticException(); // it's the part of the execution but it failed
	}

	@Test(alwaysRun = true, dependsOnMethods = "m12") // it's depends on m12 (m12 is failed)but it's not impacted on m13
														// because of alwaysRun = true
	public void m13() {
		System.out.println("I am m13");

	}

//	@Test
//	public void m14() {
//		System.out.println("I am m14");
//	}

}
