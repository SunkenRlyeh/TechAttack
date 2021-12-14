package com.stepsdefinition;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchBrandSteps extends Base {


@Given("^I am on homepage$")
public void i_am_on_homepage() throws Throwable {
   
	getDriver();
}

	@When("^i enter a \"([^\"]*)\"$")
	public void i_enter_a(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(arg1);
	}

	@When("^i click on quick find icon$")
	public void i_click_on_quick_find_icon() throws Throwable {
	}

	@Then("^i see related product list$")
	public void i_see_related_product_list() throws Throwable {
}

}