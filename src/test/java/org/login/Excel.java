package org.login;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
  
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Surya\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		WebElement alert= driver.findElement(By.className("ui-button-text ui-c"));
		alert.click();
		
		
		
		
		
		
		
		
		
				
		
		
		
	
		
		
		
		
		
		
	
	}

}
