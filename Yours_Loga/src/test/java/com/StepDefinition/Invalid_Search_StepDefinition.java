package com.StepDefinition;

import com.Base.BaseClass;
import com.Pages.Search_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invalid_Search_StepDefinition extends BaseClass
{
	Search_Page obj;
	@Given("^The user launch the chrome browser$")
	public void the_user_launch_the_chrome_browser() throws Throwable
	{
	   launchBrowser();
	   obj = new Search_Page(driver);
	}

	@When("^The user open the login page$")
	public void the_user_open_the_login_page() throws Throwable
	{
	  url();  
	}

	@Then("^The user perform Invalid Search$")
	public void the_user_perform_Invalid_Search() throws Throwable
	{
	   obj.invalidSearch(); 
	}

	@Then("^Print the error message in the console$")
	public void print_the_error_message_in_the_console() throws Throwable
	{
	   obj.search_ErrorMsg();
	   Thread.sleep(3000);
	   Screenshot("src\\test\\resources\\Screenshot\\Invalid_Search.jpg");
	   close();
	}


}
