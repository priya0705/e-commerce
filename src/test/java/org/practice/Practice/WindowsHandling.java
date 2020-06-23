package org.practice.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\Practice\\Chrome driver83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mask");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//span[contains(text(),'Disposable Air Pollution & Protection Mask Face Mask Nose Mask Dust Mask surgical mask (PACK OF 10)')]")).click();
        Set<String> s=driver.getWindowHandles();
        List<String> li=new ArrayList<String>(s);
        Thread.sleep(4000);
        driver.switchTo().window(li.get(0));
        Thread.sleep(4000);
        driver.switchTo().window(li.get(1));
        Thread.sleep(4000);
        driver.switchTo().window(li.get(0));
        
	}

}