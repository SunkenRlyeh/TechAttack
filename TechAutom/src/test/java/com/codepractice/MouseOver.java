package com.codepractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	
		
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver	driver=new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		//creating the actions class
		Actions actions= new Actions (driver);
		//creating web element to call during actions
		WebElement from= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement signin=	driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		//using actions to hover and click
		actions.moveToElement(from).moveToElement(signin).click().build().perform();
		//rest of the sign in method
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email@email.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("playstation 5");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'NexiGo 2020')]"));
		//screenshot method
		Screenshot.getshot(driver, "test");
		
	}// end of main
	
	
	
	
}//end of class
