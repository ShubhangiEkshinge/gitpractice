package com.testng.parametersdemo.listenersdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import ru.yandex.qatools.ashot.AShot;

public class MyListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}
  //take a screenshot with the help of selenium(It's take a screenshot of viewport only,means only visible part captured) 
	//Using getScreenshotAs() method of selenium
	@Override
	public void onTestFailure(ITestResult result) {
		// System.out.println("on test failure");
		String dir = System.getProperty("user.dir");// we write this for current working directory(gives th whole path
													// of progect)
		// System.out.println("current working directory is:"+dir);//It returns the path
		// of the project
		File src = BaseClass.driver.getScreenshotAs(OutputType.FILE);
		// FileUtils.write(src,new File(""));//write method take as an arguments is
		// source file & destination file(we have to provide a path(own created))
		try {
			FileUtils.copyFile(src, new File(dir + "/screenshots/image.jpg"));// where we want to save screenshot that
																				// path passed here(create the
																				// folder:/screenshot/image.jpg)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test failure but within success percentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

}
