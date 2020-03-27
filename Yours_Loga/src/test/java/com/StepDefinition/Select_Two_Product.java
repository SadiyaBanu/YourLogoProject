package com.StepDefinition;

import com.Base.BaseClass;
import com.Pages.Search_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Select_Two_Product extends BaseClass
{
	Search_Page obj;
	@Given("^The user launches the chrome browser$")
	public void the_user_launches_the_chrome_browser() throws Throwable
	{
		launchBrowser();
		obj = new Search_Page(driver);
	   
	}

	@When("^The user opens the login page$")
	public void the_user_opens_the_login_page() throws Throwable
	{
	    url();
	}

	@Then("^The user Search and select two products$")
	public void the_user_Search_and_select_two_products() throws Throwable
	{
	   obj.twoProduct_Select();
	   obj.addToCard();
	   Screenshot("src\\test\\resources\\Screenshot\\BeforeRemovingProduct.jpg");
	}

	@Then("^The user remove one product from card$")
	public void the_user_remove_one_product_from_card() throws Throwable
	{
		obj.removeProduct();
		Thread.sleep(5000);
		Screenshot("src\\test\\resources\\Screenshot\\AfterRemovingProduct.jpg");
		close();
	    
	}



}
