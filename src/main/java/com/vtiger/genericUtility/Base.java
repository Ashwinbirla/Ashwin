package com.vtiger.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectrepos.HomePage;
import com.vtiger.objectrepos.LoginPage;

public class Base {
	public PropertyFileUtility putil = new PropertyFileUtility();
	public ExcelFileUtility eutil = new ExcelFileUtility();
	public JavaUtility jutil = new JavaUtility();
	public WebdriverUtility wutil = new WebdriverUtility();
	// run time polymorphism
	public WebDriver driver = null;

	@BeforeSuite
	public void bsconfig() {
		Reporter.log("===DB CONNECTION===", true);
	}

	@AfterSuite
	public void asconfig() {
		Reporter.log("===DB DISCONNECTION===", true);
	}

	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER = putil.readDataFrompf("browser");
		String URL = putil.readDataFrompf("url");
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("chrome browser has launch", true);
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
			Reporter.log("edge browser has launch");
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("firefox browser has launch");
		} else {
			System.out.println("U have given invalid browser name into property file");

		}
		driver.get(URL);
		wutil.maximize(driver);
		wutil.waitforPageload(driver);
	
	}

	@AfterClass
	public void teardown() {
		driver.quit();
		Reporter.log("close browser", true);
	}

	@BeforeMethod
	public void logintoapp() throws Throwable {
		String UN = putil.readDataFrompf("un");
		String PWD = putil.readDataFrompf("pwd");
		LoginPage lp = new LoginPage(driver);
		lp.loginToapp(UN, PWD);
		Reporter.log("user get login successfully to the app", true);
	}

	@AfterMethod
	public void logtoapp() {

		HomePage hp = new HomePage(driver);
		hp.logoutfromapp(driver);
		Reporter.log("user gets logout from app successfully", true);
	}
}
