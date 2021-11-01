package com.testng.parametersdemo.dataprovidersdemo;

import org.testng.annotations.DataProvider;

public class DataProviderDemo { // It's a dataProvider class is provide Login data to the TestCase

	@DataProvider(name = "Login Data") // It's a annotation of TestNG
	public Object[][] numberData() {
		Object[][] obj = { { 1, 2 }, { 3, 4 } }; // Hardcoded data
		return obj;

	}
}
