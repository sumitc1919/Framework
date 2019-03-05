package com.frame.testCases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public String baseURL="http://demo.guru99.com/v4/";
	public String username="mngr181790";
	public String password="uqAhAmu";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		logger=Logger.getLogger("DemoFramework");
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
