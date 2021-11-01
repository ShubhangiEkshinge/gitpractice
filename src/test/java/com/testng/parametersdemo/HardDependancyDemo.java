package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class HardDependancyDemo {
	@Test
	public void s11() {
		System.out.println("I am s11");
	}

	@Test(dependsOnMethods = "s11") // Both TC is the part of the Execution but second TC throw the
									// ArithmeticExceptioin so that's why s12 is failed
	public void s12() {
		System.out.println("I am s12");
		throw new ArithmeticException();
	}

	@Test
	public void s13() {
		System.out.println("I am s13");
		throw new ArithmeticException();
	}

	@Test(dependsOnMethods = "s13") // TC s13 is failed that's why s14 is not a part of execution(It's skip),because
									// s14 is depends on s13
	public void s14() {
		System.out.println("I am s14");
	}
}
