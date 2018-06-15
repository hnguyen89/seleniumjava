package org.openqa.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumJava{
	

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/huynhnguyen/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver ();
 String baseUrl = "https://www.bankofamerica.com/";
 driver.get(baseUrl);
 driver.manage(). window().maximize();
 driver. findElement (By.name("userId")).sendKeys("Test");
	
			
	try { 
		Thread.sleep(4000);
	} catch(InterruptedException e) {
		System.out.println("Got and error while processing");
	}
	
	driver.close();
}
	
	
}