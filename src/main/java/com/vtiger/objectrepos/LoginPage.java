package com.vtiger.objectrepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(xpath = "//input[@name='user_name']")private WebElement untxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath = "//input[@id='submitButton']")private WebElement loginbtn;
	//initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	//utilization
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	//business library
	public void loginToapp(String UN,String PWD) {
		untxt.sendKeys(UN);
		pwdtxt.sendKeys(PWD);
		loginbtn.click();
	}
}
