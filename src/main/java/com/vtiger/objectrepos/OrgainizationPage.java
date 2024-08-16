package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgainizationPage {
	//declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orglookupimg;
	//initialization
	public OrgainizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//getters
	public WebElement getLookupimg() {
		return orglookupimg;
	}
	//business library
	public void clickonlookimg() {
		orglookupimg.click();
	}

}
