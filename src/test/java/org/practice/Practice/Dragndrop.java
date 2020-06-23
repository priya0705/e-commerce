package org.practice.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\Practice\\Chrome driver83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		Actions a =new Actions(driver);
		a.dragAndDrop(source,des).perform();
		WebElement s1=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement d1=driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		a.dragAndDrop(s1, d1).perform();

	}

}
