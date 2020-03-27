package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

public class Invalid_Login_Page extends BaseClass
{
   WebDriver driver;
   public Invalid_Login_Page(WebDriver driver)
   {
	this.driver = driver; 
   }
 By signin_link = By.linkText("Sign in");
 By email = By.xpath("//input[@id='email']");
 By password = By.xpath("//input[@id='passwd']");
 By signin_button = By.xpath("//button[@id='SubmitLogin']");
 By errormsg = By.xpath("//div[@class='alert alert-danger']//child::li");

 public void login() throws InterruptedException
	{
		Thread.sleep(3000);
		//Click signin
		driver.findElement(signin_link).click();
	}
 public void invalidLogin() throws InterruptedException
	{
	    //Enter Email
		driver.findElement(email).sendKeys("tomma19@gmail.com");
		Thread.sleep(3000);
		//Enter password
		driver.findElement(password).sendKeys("tommas");
		Thread.sleep(3000);
	}
 public void sign_in()
	{
	    //Click signin
		driver.findElement(signin_button).click();
	}
 public void errorMsg()
	{
	    //Print Error message
		String msg = driver.findElement(errormsg).getText();
		System.out.println("Error Message:  "+msg);
	}
	
 
 
}
