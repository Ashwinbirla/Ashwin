package com.vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebdriverUtility {
	/**
	 * this method is used for maximize the window
	 * @author ASHWIN
	 */
public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * this method is used for minimize window
 * @author ASHWIN 
 */
public void minimize(WebDriver driver) {
	driver.manage().window().minimize();
}
/**
 * this method is used for entire webpage is loaded
 * @author ASHWIN
 */
public void waitforPageload(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
/**
 * this method is used to handle drop down with the help of index
 * @author ASHWIN
 */
public void handleDropDown(WebElement ele,int index) {
	Select s =new Select(ele);
			s.selectByIndex(index);
}
/**
 * this method is used to handle drop down with help of value
 * @author ASHWIN
 */
public void handleDropDown(WebElement ele,String value) {
Select s= new Select(ele);
s.selectByValue(value);
}
/**
 * this method is used to hale drop down with the help of text
 * @author ASHWIN
 */
public void handleDropDown(String text,WebElement ele) {
	Select s=new Select(ele);
			s.selectByVisibleText(text);
}
/**
 * @author ASHWIN
 * this method is used for move the cursor
 */
public void moveToElement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
	
}
/**
 * @author ASHWIN
 * this method is used for right click operation
 */
public void rightClickoneelement(WebDriver driver,WebElement element) {
Actions a=new Actions(driver);
a.contextClick(element).perform();
}
/**
 * @author ASHWIN
 * this method is used for click on element
 */
public void clickOnelement(WebDriver driver,WebElement element) {
	Actions a=new Actions(driver);
	a.click(element).perform();
}
/**
 * @author ASHWIN
 * this method is used for drag and drop purpose
 */
public void draganddrop(WebDriver driver,WebElement srcele,WebElement desele) {
	Actions a=new Actions(driver);
	a.dragAndDrop(srcele, desele).perform();
}
/**
 * @author ASHWIN
 * this method is used for takes screen shot
 * @throws Throwable 
 */
public void getScreenshot(WebDriver driver) throws Throwable   {
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./"+"\\src\\test\\resources\\screenshot\\vtiger.png");
	Files.copy(src, dest);
	
}	

}
