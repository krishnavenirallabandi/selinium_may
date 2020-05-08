package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch1 {
	

	public static void main(String[] args) {
		WebDriver driver;
		//the driver path is set through environmen variable permanently
		//we can also keep the drivers in current project dirctory
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver=new EdgeDriver();
		driver.get("https://snapdeal.com");
		
		
		
		
		
			}

}
