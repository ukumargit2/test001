package com.ujjwal.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;


public class TestCases {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
//	  driver = new FirefoxDriver();
//	  driver.manage().window().maximize();
//	  driver.get("https://www.google.co.in");
	  System.setProperty("webdriver.chrome.driver", "D:/Selenium st/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.close();
	  
  }
  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
