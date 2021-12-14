package com.stepsdefinition;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import com.common.Base;
import com.pageobjectmodel.CreateAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccountSteps extends Base {
	CreateAccountPage pf;
	@Given("^I am on oscommerce\\.com$")
	public void i_am_on_oscommerce_com() throws Throwable {
		getDriver();
		pf=PageFactory.initElements(driver, CreateAccountPage.class);
	}

	@When("^I click on my account button$")
	public void i_click_on_my_account_button() throws Throwable {
		pf.getmyaccount();
		//CreateAccountPage c=new CreateAccountPage(driver);
		//c.getmyaccount();
		//driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	}

	@When("^I click on continue button from new customer section$")
	public void i_click_on_continue_button_from_new_customer_section() throws Throwable {
		pf.getcon();
		//CreateAccountPage a=new CreateAccountPage(driver);
		//a.getcon();
		//driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
	}

	@Then("^I see my account information page$")
	public void i_see_my_account_information_page() throws Throwable {
		WebElement a=driver.findElement(By.xpath("//h1[contains(text(),'My Account Information')]"));
		Assert.assertEquals(a.getText(),"My Account Information");
		System.out.println(a.getText());
	}

	@When("^I select male or female radio button$")
	public void i_select_male_or_female_radio_button() throws Throwable {
		pf.mradio();
		//driver.findElement(By.xpath("//input[@value='m']")).click();
	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		pf.AccountInformation(arg1, arg2, arg3, arg4);
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(arg1);
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(arg2);
		//driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(arg3);
		//driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(arg4);
	}

	@When("^I select a country from the drop down$")
	public void i_select_a_country_from_the_drop_down() throws Throwable {
		pf.usa();
		//Select	s=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		//s.selectByValue("223");
		//s.selectByVisibleText("United States");
		//List<WebElement>l=s.getOptions();
		//System.out.println(l.size());
	}

	@When("^I click continue$")
	public void i_click_continue() throws Throwable {
		pf.conts();
		//driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		//driver.findElement(By.xpath("(//span[@class='ui-button-text'])[4]")).click();
	}

	@Then("^I see a pop up error message$")
	public void i_see_a_pop_up_error_message() throws Throwable {
		driver.switchTo().alert().accept();
	}
}
