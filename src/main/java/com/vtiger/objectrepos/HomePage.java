package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericUtility.WebdriverUtility;

public class HomePage extends WebdriverUtility {
	//initialization
	@FindBy(xpath = "//a[text()='Organizations']")private WebElement orgainzatilnk;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement contactlnk;
	@FindBy(xpath = "//a[text()='Opportunities']")private WebElement opportunitylnk;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement administrationimg;
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement signoutlnk;
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getOrgainzatilnk() {
		return orgainzatilnk;
	}
	public WebElement getContactlnk() {
		return contactlnk;
	}
	public WebElement getOpportunitylnk() {
		return opportunitylnk;
	}
	public WebElement getAdministrationimg() {
		return administrationimg;
	}
	public WebElement getSignoutlnk() {
		return signoutlnk;
	}
//business library
	
		public void clickOnOrgLink() {
			orgainzatilnk.click();
		}
		public void clickOnCntLnk() {
			contactlnk.click();
		}
		public void logoutfromapp(WebDriver driver) {
	    moveToElement(driver, administrationimg);
		signoutlnk.click();
	}
}
