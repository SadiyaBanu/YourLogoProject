package com.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Base.ExcelRead;

public class Valid_Registration
{
	WebDriver driver;
	ExcelRead obj = new ExcelRead();
  public Valid_Registration(WebDriver driver)
  {
	  this.driver = driver;
  }
  By signin_link = By.linkText("Sign in");
  By email = By.xpath("//input[@id='email_create']");
  By createaccount = By.xpath("//button[@id='SubmitCreate']");
  By firstname = By.xpath("//input[@id='customer_firstname']");
  By lastname = By.xpath("//input[@id='customer_lastname']");
  By password = By.xpath("//input[@id='passwd']");
  By dateclick = By.xpath("//select[@id='days']");
  By date = By.xpath("//option[@value='11']");
  By monthclick = By.xpath("//select[@id='months']");
  By month = By.xpath("(//option[@value='4'])[2]");
  By yearclick = By.xpath("//select[@id='years']");
  By year = By.xpath("//option[@value='2019']");
  By address = By.xpath("//input[@id='address1']");
  By city = By.xpath("//input[@id='city']");
  By state = By.xpath("//select[@id='id_state']");
  By california = By.xpath("//option[@value='5']");
  By zipcode = By.xpath("//input[@id='postcode']");
  By country = By.xpath("//select[@id='id_country']");
  By unitedstate = By.xpath("(//option[@value='21'])[2]");
  By mobileno = By.xpath("//input[@id='phone_mobile']");
  By aliasaddress = By.xpath("//input[@id='alias']");
  By register = By.xpath("//button[@id='submitAccount']");
  
  public void signIn()
  {
	driver.findElement(signin_link).click();  
  }
  public void createAccount()
  {
	 driver.findElement(email).sendKeys("tom5917@gmail.com");
	 driver.findElement(createaccount).click();
	  
  }
  //read and enter details from the excel sheet
  public void enterDetails() throws IOException, InterruptedException
  {
	  driver.findElement(firstname).sendKeys(obj.readExcel1(0));
	  driver.findElement(lastname).sendKeys(obj.readExcel1(1));
	  driver.findElement(password).sendKeys(obj.readExcel1(2));
	  driver.findElement(dateclick).click();
	  Thread.sleep(3000);
	  driver.findElement(date).click();
	  Thread.sleep(3000);
	  driver.findElement(monthclick).click();
	  Thread.sleep(3000);
	  driver.findElement(month).click();
	  Thread.sleep(3000);
	  driver.findElement(yearclick).click();
	  Thread.sleep(3000);
	  driver.findElement(year).click();
	  Thread.sleep(3000);
	  driver.findElement(address).sendKeys(obj.readExcel1(3));
	  driver.findElement(city).sendKeys(obj.readExcel1(4));
	  driver.findElement(state).click();
	  Thread.sleep(3000);
	  driver.findElement(california).click();
	  driver.findElement(country).click();
	  Thread.sleep(3000);
	  driver.findElement(unitedstate).click();
	  driver.findElement(aliasaddress).sendKeys(obj.readExcel1(7));
	  
  }
  public void details() throws IOException
  {
	  driver.findElement(zipcode).sendKeys(obj.readExcel2(5));
	  driver.findElement(mobileno).sendKeys(obj.readExcel2(6));
  }
  //click register button
  public void register()
  {
	  driver.findElement(register).click();
  }
}
