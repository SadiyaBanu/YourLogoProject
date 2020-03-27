package com.StepDefinition;

import com.Base.BaseClass;
import com.Pages.Search_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Compare_Product extends BaseClass
{
	Search_Page obj;
	@Given("^The user launches a chrome browser$")
	public void the_user_launches_a_chrome_browser() throws Throwable
	{
	  launchBrowser();
	  obj = new Search_Page(driver);
	}

	@When("^The user opens a login page$")
	public void the_user_opens_a_login_page() throws Throwable
	{
	   url(); 
	}

	@Then("^The user Search and Select two products$")
	public void the_user_Search_and_Select_two_products() throws Throwable
	{
	  obj.selectProductCompare(); 
	}

	@Then("^The user compare two product$")
	public void the_user_compare_two_product() throws Throwable
	{
	   obj.compareProduct();
	   Thread.sleep(3000);
	   Screenshot("src\\test\\resources\\Screenshot\\CompareProduct.jpg");
	   Thread.sleep(3000);
	   close();
	}


}
