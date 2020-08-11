package com.seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExecution {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
				
		driver.get("https://amazon.in/");
		
		String title = driver.getTitle();
		System.out.println("Current Page title is : " + title);
		
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Page title is correct");
		}
		else {
			System.out.println("Page Title is incorrect");
		}
		
		driver.quit();
		
		
		
		// 2) Opening code for https://demo.cs-cart.com/
		
		  WebDriver driver1 = new ChromeDriver();
		 
		 driver1.manage().window().maximize(); driver1.manage().deleteAllCookies();
		  
		 driver1.get("https://demo.cs-cart.com/");
		
		 String url = driver1.getCurrentUrl();
		 System.out.println("Current Page Url is : "+ url);
		  
		  if(url.equals("https://demo.cs-cart.com/")) 
		  {
		   
			  System.out.println("Opened URL is correct"); 
		  } 
		  
		  else 
			  
		  {
		  
			  System.out.println("Opened URL is not correct"); 
			  
		  }
		 
		 driver1.quit();
   }

}
