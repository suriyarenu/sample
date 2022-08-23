package org.login;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestIng extends BaseClassTest { 
	
	
	@Parameters({"browser"})
	@Test
	public  void tc02(String browser) { 

		if (browser.equalsIgnoreCase("chrome")) {
	
			
			getDriver();
			browser("chrome");
			
		}else {
			browser("edge");
		
		
		
		
	 
	
	
	
		} 
		} 
	} 

 
		
	 

