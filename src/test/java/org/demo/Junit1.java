package org.demo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class Junit1 extends BaseClass{
	public static void main(String[] args) throws AWTException {
		
	{
		launchChrome();
		winMax();
		loadUrl("https://www.amazon.in/");
		WebElement btn = driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]"));
		rightClick(btn);
		downkey(3);
		enterKey();
		
		
	}
	}
}
