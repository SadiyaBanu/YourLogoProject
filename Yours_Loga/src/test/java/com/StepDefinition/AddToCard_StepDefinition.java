package com.StepDefinition;

import com.Base.BaseClass;
import com.Pages.Search_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCard_StepDefinition extends BaseClass
{
	Search_Page obj;
	@Given("^The user launch an chrome browser$")
	public void the_user_launch_an_chrome_browser() throws Throwable
	{
		launchBrowser();
		obj = new Search_Page(driver);
	}
	@When("^The user open an login page$")
	public void the_user_open_an_login_page() throws Throwable
	{
	   url();
	   obj.login();
	}
	@Then("^The user Search a product$")
	public void the_user_Search_a_product() throws Throwable
	{
	   obj.search();
	}
	@Then("^The user increase the quantity and click add to card$")
	public void the_user_increase_the_quantity_and_click_add_to_card() throws Throwable
	{
	   obj.addToCard(); 
	}

	@Then("^check the price of the product$")
	public void check_the_price_of_the_product() throws Throwable
	{
	   obj.priceCheck();
	   Screenshot("src\\test\\resources\\Screenshot\\AddToCard.jpg");
	   close();   
	}
}
