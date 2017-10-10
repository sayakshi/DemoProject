package automationFramework.Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[contains(.,'Product Category')]"));
		
		Actions action =new Actions(driver);
		action.moveToElement(element).build().perform();
		
		//System.out.println(bal);
		
		WebElement sub=driver.findElement(By.xpath("//a[contains(.,'iPods')]"));
		action.moveToElement(sub).click().perform();
		
		
	}

}
