package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.BaseClass;

public class Search_Page extends BaseClass
{
  WebDriver driver;
  public Search_Page(WebDriver driver)
  {
	  this.driver = driver;
  }
  By searchbox = By.xpath("//input[@name='search_query']");
  By searchbutton = By.xpath("//button[@type='submit']");
  By image = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']");
  By quantity_plus = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
  By addtocard = By.xpath("//button[@class='exclusive']");
  By windowhandlingbutton = By.xpath("//a[@class='btn btn-default button button-medium']");
  By price = By.xpath("//td[@class='price']");
  By proceedtocheckout = By.xpath("(//a[@title='Proceed to checkout'])[2]");
  By card = By.xpath("//a[@title='View my shopping cart']");
  By errormsg = By.xpath("//div[@id='center_column']//child::p");
  
  By list = By.xpath("//li[@id='list']");
  By addtocardp1 = By.xpath("(//a[@data-id-product='5'])[1]");
  By continueShopping = By.xpath("//span[@title='Continue shopping']");
  By addtocardp2 = By.xpath("(//a[@data-id-product='4'])[1]");
  By delete = By.xpath("//td[@class='cart_delete text-center']");
  By compare1 = By.xpath("(//a[@data-id-product='5'])[2]");
  By compare2 = By.xpath("(//a[@data-id-product='4'])[2]");
  By compare = By.xpath("//form[@class='compare-form']");
  
  public void login() throws InterruptedException
  {
	   Thread.sleep(3000);
	   //To get Title
	   System.out.println(driver.getTitle());
	   Thread.sleep(3000);
  }
  //Perform search opeartion
  public void search() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElement(searchbox).click();
	  Thread.sleep(3000);
	  driver.findElement(searchbox).sendKeys("printed dress");
	  Thread.sleep(3000);
	  driver.findElement(searchbutton).click();
	  Thread.sleep(3000);
	  driver.findElement(image).click();
	  Thread.sleep(3000);
	  driver.findElement(quantity_plus).click();
	  driver.findElement(addtocard).click();	  
  }
  //Perform add to card operation
  public void addToCard() throws InterruptedException
  {
	  //window handling
	  String win = driver.getWindowHandle();
	  driver.switchTo().window(win);
	  Thread.sleep(3000);
	  driver.findElement(windowhandlingbutton).click();
	  Thread.sleep(3000);
	  	  
  }
  //compare total price
  public void priceCheck()
  {
	  double actual = 101.98;
	  String totalprice =driver.findElement(price).getText();
	  String price1 = totalprice.substring(1);
	  double total = Double.parseDouble(price1);
	  driver.findElement(proceedtocheckout).click();
	  WebElement we = driver.findElement(card);
	  Actions action = new Actions(driver);
	  action.moveToElement(we).pause(10000).build().perform();
	  if(total == actual)
	  {
		  System.out.println("Test Case Passed!");
	  }
	  else
	  {
		  System.out.println("Test Case Failed!");
	  }
  }
  //invalid search operation
  public void invalidSearch() throws InterruptedException
  {
	driver.findElement(searchbox).click();
	Thread.sleep(3000);
	driver.findElement(searchbox).sendKeys("laptop");
	Thread.sleep(3000);
	driver.findElement(searchbutton).click();
  }
  public void search_ErrorMsg() throws InterruptedException
	{
	  driver.findElement(searchbutton).click();
	  Thread.sleep(2000);
	  String msg = driver.findElement(errormsg).getText();
	  System.out.println("Error Message: "+msg);
	}
  
  public void twoProduct_Select() throws InterruptedException
  {
	  driver.findElement(searchbox).click();
	  Thread.sleep(3000);
	  driver.findElement(searchbox).sendKeys("dresses");
	  Thread.sleep(3000);
	  driver.findElement(searchbutton).click();
	  Thread.sleep(3000);
	  driver.findElement(list).click();
	  Thread.sleep(3000);
	  //select first product
	  driver.findElement(addtocardp1).click();
	  Thread.sleep(3000);
	  String win = driver.getWindowHandle();
	  driver.switchTo().window(win);
	  Thread.sleep(3000);
	  driver.findElement(continueShopping).click();
	  Thread.sleep(3000);
	  //Select second product
	  driver.findElement(addtocardp2).click();  
  }
  public void removeProduct() throws InterruptedException
  {
	  Thread.sleep(3000);
	  //delete one product
	 driver.findElement(delete).click(); 
  }
  //compare two product
  public void selectProductCompare() throws InterruptedException
  {
	  driver.findElement(searchbox).click();
	  Thread.sleep(3000);
	  driver.findElement(searchbox).sendKeys("dresses");
	  Thread.sleep(3000);
	  driver.findElement(searchbutton).click();
	  Thread.sleep(3000);
	  driver.findElement(list).click();
	  Thread.sleep(3000);
	  driver.findElement(compare1).click();;
	  Thread.sleep(3000);
	  driver.findElement(compare2).click();;
	  Thread.sleep(3000);
	        
  }
  public void compareProduct()
  {
	  driver.findElement(compare).click();  
  }
  
}
