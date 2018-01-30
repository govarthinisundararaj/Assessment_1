package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LandingPage {

	private static final String SECONDS = null;
	WebDriver pageUnderTest = null;
	
	
	public WebDriver getDriverHandle(String stringWebSiteURL)
	{
		String exePath = "D:\\chromedriver\\chromedriver.exe";
		ChromeDriverService.Builder serviceBuilder = new ChromeDriverService.Builder();
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		serviceBuilder.withLogFile(new File("D:\\logs\\logFile.txt"));
		driver.get(stringWebSiteURL);
		this.pageUnderTest=driver;
		return driver;
	}
	
	
	public static void main(String args[]) throws InterruptedException
	{
		LandingPage myPageRef = new LandingPage();
		
		WebDriver webDriver = myPageRef.getDriverHandle("file:///D:/govarthini/Task2/WebContent/index.html");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());
		
		/*Navigational Commands*/
		/*System.out.println("Going to click Todays Deals");*/
		WebElement Box1=webDriver.findElement(By.name("text1"));
		Box1.click();
		Box1.sendKeys("Govarthini");
		WebElement Box2=webDriver.findElement(By.name("text2"));
		Box2.click();
		Box2.sendKeys("gogul");
		webDriver.findElement(By.xpath("/html/body/form/button")).click();
		
		
		
		
		
		
		
		
		/*WebElement searchBox= webDriver.findElement(By.name("field-keywords"));
		//Click on the searchBox
		searchBox.click();
		searchBox.sendKeys("Samsung Phones");
		/*
		/*WebElement searchButton= webDriver.findElement(By.xpath("//*//*[@id='nav-xshop']/a[3]"));
		//*[@id="nav-search"]/form/div[2]/div/input
		//Click on the searchBox
		searchButton.click();
		WebElement searchBox= webDriver.findElement(By.name("q"));
		//Click on the searchBox
		searchBox.click();
		searchBox.sendKeys("selenium");
		//       //*[@id="nav-search"]/form/div[2]/div/input
		WebElement searchButton= webDriver.findElement(By.name("btnK"));
		searchButton.click();
		Thread.sleep(10000);
		webDriver.navigate().to("https://www.google.com/");
		*/
	}
	
}
