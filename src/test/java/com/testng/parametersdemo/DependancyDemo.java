package com.testng.parametersdemo;

import org.testng.annotations.Test;

public class DependancyDemo {

//	@Test(dependsOnMethods = "SoftDependancyDemo.m14")
//	public void method1() {
//		System.out.println("method1");
//	}

	@Test
	public void method5() { // It's failed because throw the exceptions
		System.out.println("I am method5");
		throw new ArithmeticException();
	}

	@Test(dependsOnMethods = { "method5", "method7" }) // this is the part of the execution(it's skipped) becuase
														// method5 is failed
	public void method6() {
		System.out.println("I am method6");
	}

	@Test
	public void method7() {
		System.out.println("I am method7");// this will be execute
	}

//	@Test
//	public void method2() {
//		System.out.println("method2");
//		throw new ArithmeticException();
//	}
//
//	@Test(dependsOnMethods = "method4")
//	public void method3() {
//		System.out.println("method3");
//	}
//
//	@Test
//	public void method4() {
//		System.out.println("method4");
//	}
}
