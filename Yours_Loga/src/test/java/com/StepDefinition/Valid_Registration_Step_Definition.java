package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.Pages.Valid_Registration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Valid_Registration_Step_Definition extends BaseClass
{
	Valid_Registration obj;
	@Given("^The user launches an chrome browser$")
	public void the_user_launches_an_chrome_browser() throws Throwable
	{
	  launchBrowser();
	  obj = new Valid_Registration(driver);    
	}

	@When("^The user opens an login page$")
	public void the_user_opens_an_login_page() throws Throwable
	{
	    url();
	    obj.signIn();
	}

	@Then("^The user email and click register$")
	public void the_user_email_and_click_register() throws Throwable
	{
	   obj.createAccount();
	}

	@Then("^The user enters all valid details$")
	public void the_user_enters_all_valid_details() throws Throwable
	{
	  obj.enterDetails();
	  obj.details();
	}

	@Then("^The user clicks Register button$")
	public void the_user_clicks_Register_button() throws Throwable
	{
	   obj.register();
	   Thread.sleep(3000);
	   Screenshot("src\\test\\resources\\Screenshot\\ValidRegistration.jpg");
	   Thread.sleep(3000);
	   close();
	}


}
