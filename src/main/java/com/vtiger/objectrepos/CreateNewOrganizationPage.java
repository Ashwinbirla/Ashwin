package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	//Declaration
	@FindBy(xpath = "//input[@name='accountname']")private WebElement orgnamedeeit;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement savebtn;
	//initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getOrgnamedeeit() {
		return orgnamedeeit;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	//business library
	public void createNewOrgainzation(String ORGNAME) {
		orgnamedeeit.sendKeys(ORGNAME);
		savebtn.click();
	}

}
