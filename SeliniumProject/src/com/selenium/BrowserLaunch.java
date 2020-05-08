package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
	

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\krish\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.com");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\krish\\Downloads\\softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://www.flipkart.com");
		EdgeDriver driver4=new EdgeDriver();
		driver4.get("https://www.snapdeal.com");
		
		
		
		

	}

}
