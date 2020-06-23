package org.practice.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\Practice\\Chrome driver83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement pralert=driver.findElement(By.xpath("//input[@name='prompt']"));
		pralert.click();
		Alert  alrt=driver.switchTo().alert();
		alrt.sendKeys("alert test");
		System.out.println(alrt.getText());
		/*alrt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(3000);
		Alert cnfmalert=driver.switchTo().alert();
		cnfmalert.dismiss();*/
		
	}

}
