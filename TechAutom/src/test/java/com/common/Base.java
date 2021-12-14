package com.common;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {



public WebDriver driver;


public void getDriver() {
	
	System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://demo.oscommerce.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

}