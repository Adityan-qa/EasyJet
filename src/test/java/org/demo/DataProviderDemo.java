package org.demo;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	@DataProvider(name="loginData")
	private Object[][] getData()  {
		
	      return new Object[][] {
		{"greens","greens@123"},
		{"sql","sql@123"},
		{"java","java@12"},

	};
	}
}