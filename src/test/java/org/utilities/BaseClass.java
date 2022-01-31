package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BaseClass  {
	
	public static WebDriver driver;
	public static Actions a ;
	public static Robot r ;
	 
	// Launch Chrome
	public static void launchChrome() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
	}
	// Loading Url
	public static void loadUrl(String url) {
		driver.get(url);

	}
	// Maximize window
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
	// Print current url
	public static void printTitle() {
		System.out.println(driver.getCurrentUrl());
	
	}
	
	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	
	//Quit Browser
	public static void quitBrowser() {
		driver.quit();
	}
	// Send keys
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
		
	}
	//Click
	public static void btnClick(WebElement ele) {
		ele.click();
    }
	
	//ActionClick
	public static void actionClick() {
		a = new Actions(driver);
		a.click().perform();
	}
	
	//MouseHover
	public static void mouseHover(WebElement ele)  {
		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//Right Click
	public static void rightClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick(ele).perform();

	}
	
	//Double Click
		public static void doubleClick(WebElement ele) {
			a = new Actions(driver);
			a.doubleClick(ele).perform();
    }
	
	
	//EnterKey
	public static void enterKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
    }
	
	// DownKey
	public static  void downkey(int times) throws AWTException {
		r = new Robot();
		for(int i=0 ;i<times;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}	
	}
	
	// upkey
	
	
	
	
	
	
	
	
	
	// Read from Excel
	public static String getData(int row , int column) throws IOException {
		File f = new File("F:\\Users\\asus\\eclipse-workspace\\AutoMaven\\Excel\\DataDriven.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new  XSSFWorkbook(fin);
		Sheet s = w.getSheet("Java");
		Row r = s.getRow(row);
		Cell c = r.getCell(column);
		int a = c.getCellType();
		String value ="";
		if(a==1) {
			 value = c.getStringCellValue();
		}
		else if (a==0) {
			double num = c.getNumericCellValue();
			long l = (long)num;
			 value = String.valueOf(l);
	}
		return value ;	
		}
}

