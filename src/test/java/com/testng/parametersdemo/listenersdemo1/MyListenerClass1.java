package com.testng.parametersdemo.listenersdemo1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class MyListenerClass1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}

//we need to 3rd party libarary If we want to use Ashot libarary(dowmload frm mvn repository
	@Override
	public void onTestFailure(ITestResult result) {
		// System.out.println("on test failure");
		String dir = System.getProperty("user.dir");// current working directory of the user
		//System.out.println(dir);
		AShot ashot = new AShot();
		Screenshot sc = ashot.takeScreenshot(BaseClass1.driver);// this method returns the screenshot object
		BufferedImage image = sc.getImage();
		try {
			ImageIO.write(image, "png", new File(dir + "/AshotScreenshot/image.png")); //create folder
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
		System.out.println("on test failed but within success percentage");
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
