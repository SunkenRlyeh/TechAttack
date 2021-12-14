package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	
	public	WebDriver driver;
	
@Test
@Parameters("Trios")

	public void getBrowser (String s) {
		if (s.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}//end of chrome
	
	
	else if  (s.equalsIgnoreCase("firefox")) {
		
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
	}//end of firefox
	
	else if  (s.equalsIgnoreCase("edge")) {
		
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		
		
	}//end of edge
		
		driver.get("https://target.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
	
		
		
		
	}//end of main
	
	
	
	
}//end of class
	

