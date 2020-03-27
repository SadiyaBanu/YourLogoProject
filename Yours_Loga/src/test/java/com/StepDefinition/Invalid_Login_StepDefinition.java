package com.StepDefinition;

import com.Base.BaseClass;
import com.Pages.Invalid_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invalid_Login_StepDefinition extends BaseClass
{
	Invalid_Login_Page obj;
	 @Given("^The user launch a chrome browser$")
	    public void the_user_launch_a_chrome_browser() throws Throwable
	    {
	       launchBrowser();
	       obj = new Invalid_Login_Page(driver);
	    }

	    @When("^The user open a login page$")
	    public void the_user_open_a_login_page() throws Throwable
	    {
	        url();
	    }

	    @Then("^The user click sign in$")
	    public void the_user_click_sign_in() throws Throwable
	    {
	       obj.login(); 
	    }

	    @Then("^The user enter invalid details$")
	    public void the_user_enter_invalid_details() throws Throwable
	    {
	       obj.invalidLogin();
	    }
	    @Then("^The user click sigin in button and print error message in the console$")
	    public void the_user_click_sigin_in_button_and_print_error_message_in_the_console() throws Throwable
	    {
	    	obj.sign_in();
	    	Thread.sleep(3000);
	    	obj.errorMsg();
	    	Thread.sleep(2000);
	    	Screenshot("src\\test\\resources\\Screenshot\\InvalidLogin.jpg");
	    	Thread.sleep(2000);
	    	close();
	       
	    }





	}
