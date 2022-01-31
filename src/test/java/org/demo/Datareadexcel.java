package org.demo;

import org.utilities.BaseClass;
import org.utilities.FBLoginPojo;



public class Datareadexcel extends BaseClass  {
	public static void main(String[] args) throws Exception  {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com/");
		FBLoginPojo fb = new FBLoginPojo();
		
		fill(fb.getTxtUser(), getData(1, 0));
		fill(fb.getTxtPass(), getData(1, 1));
		btnClick(fb.getBtnLogin());
	}}