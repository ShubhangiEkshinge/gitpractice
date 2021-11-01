package com.testng.parametersdemo.listenersdemo2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class MyListenerClass2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
	}

//take a screenshot when testCase failed-Ashot(using shootingstrategy())
	@Override
	public void onTestFailure(ITestResult result) {
		// System.out.println("On test Failure");
		String dir = System.getProperty("user.dir");
		//System.out.println(dir);
		AShot ashot = new AShot();
		ShootingStrategy start = null;// (It's become the local)instance of shootingstratgy it initilize null but we
										// can't pass null
		// that's why we want to tell the strategy so we use ShootingStrategies
		// class,It's having static methods
		// viewportpasting() methods(return type is shootingstrategy)-scroll the screen
		// after certain timeout,If I pass
		// the 2000 milisecond it means scroll the page after every 2 sec & stop 2 sec
		// &vise-versa,scrool the page till at the end (continuously take a screenshot)
		start = ShootingStrategies.viewportPasting(2000);// viewportpasting() is the method of ShootingStrategies's
															// class,It's take as an arguments int scrollTimeout
		ashot.shootingStrategy(start);// shootingStrategy() is Method of AShot.taking as an arguments object of
										// shootingStrategy
		Screenshot sc = ashot.takeScreenshot(BaseClass2.driver);
		BufferedImage image = sc.getImage();
		try {
			ImageIO.write(image, "png", new File(dir + "/ShootingStrategyScreenshot/image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test failed but within success percentage ");
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
