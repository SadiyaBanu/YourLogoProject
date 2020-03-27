package com.StepDefinition;

import com.Base.BaseClass;
import com.Pages.ContactUs_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs_StepDefinition extends BaseClass
{
	ContactUs_Page obj;
	@Given("^The user launch chrome application$")
	public void the_user_launch_chrome_application() throws Throwable
	{
	   launchBrowser();
	   obj = new ContactUs_Page(driver);   
	}
	@When("^The user open Contact Us page$")
	public void the_user_open_Contact_Us_page() throws Throwable
	{
		url();
	    obj.contactUs();
	}
	@Then("^The user fills the details$")
	public void the_user_fills_the_details() throws Throwable
	{
	   obj.fillDetails();
	}
	@Then("^The user submit the details$")
	public void the_user_submit_the_details() throws Throwable
	{
	  obj.submit();
	  Thread.sleep(3000);
	  Screenshot("F:\\Selenium_Code_Mars\\Yours_Loga\\src\\test\\resources\\Screenshot\\ContactUs.jpg");
	  Thread.sleep(3000);
	  close();
	}

	

}
