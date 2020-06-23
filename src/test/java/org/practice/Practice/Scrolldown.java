package org.practice.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\Practice\\Chrome driver83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement scrdown= driver.findElement(By.xpath("//a[text()='Create a Page']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrdown);
		Thread.sleep(2000);
		WebElement scrup= driver.findElement(By.xpath("//span[text()='Create an account']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrup);

	}

}
