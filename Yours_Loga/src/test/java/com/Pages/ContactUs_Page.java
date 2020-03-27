package com.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ContactUs_Page
{
  WebDriver driver;
  public ContactUs_Page(WebDriver driver)
  {
	  this.driver = driver;
  }
  By contactus = By.linkText("Contact us");
  By subjectheading = By.xpath("//select[@name='id_contact']");
  By customerservice = By.xpath("//option[@value='2']");
  By email = By.xpath("//input[@id='email']");
  By orderref = By.xpath("//input[@id='id_order']");
  By fileupload = By.xpath("//div[@id='uniform-fileUpload']");
  By message = By.xpath("//textarea[@id='message']");
  By send = By.xpath("//button[@name='submitMessage']");
  //click contact
  public void contactUs() throws InterruptedException, IOException
  {
	  driver.findElement(contactus).click();
  }
  public void fillDetails() throws InterruptedException, IOException
  {
	  driver.findElement(subjectheading).click();
	  Thread.sleep(3000);
	  driver.findElement(customerservice).click();
	  Thread.sleep(3000);
	  //Enter email address
	  driver.findElement(email).sendKeys("useras1911@gmail.com");
	  Thread.sleep(3000);
	  //Enter orderref
	  driver.findElement(orderref).sendKeys("123abc");
	  Thread.sleep(3000);
	  //upload file
	  String file = "src\\test\\resources\\resource\\contactfile.txt";
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("document.getElementsByClassName('filename')[0].innerHTML='"+file+"'");
	  Thread.sleep(3000);
	  //Enter message
	  driver.findElement(message).sendKeys("Thank You");
  }
  public void submit() throws InterruptedException
  {
	  Thread.sleep(3000);
	  //Enter send button
	  driver.findElement(send).click(); 
  }
  
}
