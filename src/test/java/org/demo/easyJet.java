package org.demo;



import java.awt.AWTException;


import org.utilities.BaseClass;
import org.utilities.EasyJetPojo;



public class easyJet extends BaseClass  {
	public static void main(String[] args) throws AWTException  {
	launchChrome();
	loadUrl("https://www.easyjet.com");
	EasyJetPojo ea = new EasyJetPojo();
	btnClick(ea.getPopUp());
	doubleClick(ea.getOriginTxtBox());
	fill(ea.getOriginTxtBox(), "M");
	enterKey();
	fill(ea.getDesTxtBox(), "Amsterdam");
	enterKey();
	
	
	
	
	
	
	}
	

}
