package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	static WebDriver driver;
	private static WebElement findElement;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
     public static void browser (String browser) { 
    	if (browser.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
    		driver = new EdgeDriver();
    		driver.manage().window().maximize();
			
		}
    	 
     }
	public static void webpage(String url) {
		driver.get(url);
	}

	public static WebElement findId(String value) {
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;
	} 
	

	public static void sendText(WebElement findElement, String value) {
		findElement.sendKeys(value);
	}
}
