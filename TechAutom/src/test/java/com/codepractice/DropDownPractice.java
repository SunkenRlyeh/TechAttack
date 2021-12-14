package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver	driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Select s=new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
		s.selectByVisibleText("Books");
		
	}//end of main

}//end of class
