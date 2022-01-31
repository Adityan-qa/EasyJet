package org.demo;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.utilities.BaseClass;

public class TestNGDemo2 extends BaseClass{
	@BeforeClass
	private void launchBrowser() {
		launchChrome();
	} 
	
	@BeforeMethod
	private void url() {
		loadUrl("https://www.easyjet.com/en");
	}
	

	

}
