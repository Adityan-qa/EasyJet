package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EasyJetPojo extends BaseClass {
	public EasyJetPojo() {
		PageFactory.initElements(driver,this);
	}
	@FindBy (id="ensCloseBanner")
	private WebElement popUp;
	
	@FindBy (name="origin")
	private WebElement originTxtBox;
	@FindBy (name="destination")
	private WebElement desTxtBox;
	@FindBy (xpath="//span[text()='Departing']")
	private WebElement departDate;
	@FindBy (xpath="//span[text()='Returning']")
	private WebElement returnDate;
	public WebElement getOriginTxtBox() {
		return originTxtBox;
	}
	public WebElement getDesTxtBox() {
		return desTxtBox;
	}
	public WebElement getDepartDate() {
		return departDate;
	}
	public WebElement getReturnDate() {
		return returnDate;
	}
	public WebElement getOneWayCheckBox() {
		return oneWayCheckBox;
	}
	public WebElement getDatePicker() {
		return datePicker;
	}
	
	public WebElement getPopUp() {
		return popUp;
	}
	@FindBy (id="one-way")
	private WebElement oneWayCheckBox ;
	@FindBy (xpath="//div[@class='drawer-tab-content-wrapper']")
	private WebElement datePicker;
	
	

	

}
