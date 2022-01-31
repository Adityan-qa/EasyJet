package org.demo;


import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FBLoginPojo;



public class TestNGDemo extends BaseClass{
	@BeforeClass
	private void browserLaunch() {
		launchChrome();
	}
	
	@AfterClass
	private void browserQuit() {
		quitBrowser();
	}
	@BeforeMethod
	private void launchFB() {
		loadUrl("https://www.facebook.com/");
	}
	@Test
	private void tc3() throws IOException, InterruptedException {
		FBLoginPojo fb = new FBLoginPojo();
		fill(fb.getTxtUser(), getData(1, 0));
		fill(fb.getTxtPass(),getData(1, 1));
		btnClick(fb.getBtnLogin());
		Thread.sleep(2000);
	}
	@Test
	private void tc2() throws IOException, InterruptedException {
		FBLoginPojo fb = new FBLoginPojo();
		fill(fb.getTxtUser(), getData(2, 0));
		fill(fb.getTxtPass(),getData(2, 1));
		btnClick(fb.getBtnLogin());
		Thread.sleep(2000);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataProviderDemo.class)
	private void tc1(String s1,String s2) throws InterruptedException  {
		FBLoginPojo fb = new FBLoginPojo();
		fill(fb.getTxtUser(),s1);
		fill(fb.getTxtPass(),s2);
		btnClick(fb.getBtnLogin());
		Thread.sleep(2000);
		
	}
	@AfterMethod
	private void closeMsg() {
		System.out.println("ok");
	}

}
