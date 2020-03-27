package com.Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseClass
{
	public WebDriver driver;
	//To launch chrome browser
	public void launchBrowser()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium_Code_Mars\\Yours_Loga\\src\\test\\resources\\Driver\\chromedriver_v80.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//url
	public void url()
	{
		driver.get("http://automationpractice.com/index.php");
	}
	//Take screenshot
	public void Screenshot(String path)
	{
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try
        {
		   ImageIO.write(screenshot.getImage(), "jpg", new File(path));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}	
	}
	public void close()
	{
		driver.close();
	}
}
