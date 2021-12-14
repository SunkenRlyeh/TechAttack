package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	public WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[contains(text(),'My Account')]")
		WebElement myaccount;
	public void getmyaccount () {
		myaccount.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
		WebElement cont;
	public void getcon () {
	cont.click();
	}

	@FindBy(xpath="//input[@value='m']")
			WebElement maleradio;
	public void mradio () {
		maleradio.click();
		
	}

	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	

	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	
	@FindBy(xpath="//input[@name='email_address']")
	WebElement email;


	public void AccountInformation (String a, String b, String c, String d) {

	firstname.sendKeys(a);
	lastname.sendKeys(b);
	dob.sendKeys(c);
	email.sendKeys(d);
	
	
	}
	@FindBy(xpath="//select[@name='country']")
			WebElement country;
		public void usa() {
			Select	s=new Select(country);
			s.selectByVisibleText("United States");
			//s.selectByValue("223");
			//List<WebElement>l=s.getOptions();
			//System.out.println(l.size());
		}

		@FindBy(xpath="//span[contains(text(),'Continue')]")
			WebElement Continue;
		public void conts() {
			Continue.click();
		}

}


