package com.testng.parametersdemo.dataprovidersdemo;

import org.testng.annotations.Test;

public class TestCase_001 {

	@Test(dataProvider = "Login Data ") // here dataProvider is a parameter of @Test annotation
	public void testCase_01(Object obj1, Object obj2) { // we can't put array direct here,it takes value one by
														// one,That's we written obj1 &obj2
		// System.out.println("testCase_01");
	}

}
