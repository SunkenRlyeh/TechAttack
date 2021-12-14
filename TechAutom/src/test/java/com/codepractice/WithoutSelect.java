package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://target.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@data-test='footerMenu-Help']")).click();
		List<WebElement> l=driver.findElements(By.xpath("//ul[@id='options']/li"));
		//System.out.println(l.size());
		
		for(int i=1;i<l.size();i++) {
		//String x=l.get(i).getText();
		//System.out.println(x);
		driver.findElement(By.xpath("//ul[@id='options']/li[" +i+ "]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://target.com");
		driver.findElement(By.xpath("//button[@data-test='footerMenu-Help']")).click();
		}		
		
	}//end of main
}//end of class