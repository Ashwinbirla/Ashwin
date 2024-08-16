package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgainzationInformationPage {
	//declaration
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement orgheadertxt;
	//initialization
	public OrgainzationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public WebElement getOrgheadertxt() {
		return orgheadertxt;
	}
	//business class
	public String getHeaderText() {
	return orgheadertxt.getText();
	
	}

}
