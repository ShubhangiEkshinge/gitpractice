package com.testng.parametersdemo.listenersdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenersDemo implements ITestListener { //ITestListener is an interface,It's provides a method

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test failed but within success percentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish");
	}

}
