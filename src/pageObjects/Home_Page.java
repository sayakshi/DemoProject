package pageObjects;

import org.openqa.selenium.*;

public class Home_Page {
	
	private static WebElement element=null;
	
	public static WebElement lnk_MyAccount(WebDriver driver)
	{
		
		 element = driver.findElement(By.id("account"));
		 
		    return element;
		
	}
	
	public static WebElement lnk_logout(WebDriver driver)
	
	{
		element = driver.findElement(By.id("account_logout"));
		 
		 return element;
		
	}

}
