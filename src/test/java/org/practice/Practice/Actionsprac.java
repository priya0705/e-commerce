package org.practice.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsprac {

	public static void main(String[]args) throws AWTException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\Practice\\Chrome driver83\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("Priya");
	Actions a=new Actions(driver);
	a.doubleClick(username).perform();
	a.contextClick(username).perform();
	Robot r= new Robot();
	for(int i=1;i<=6;i++) {
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement passwrd=driver.findElement(By.id("pass"));
	passwrd.click();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	
}
}