package automationFramework.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//button[contains(.,'Prompt Pop up')]"));
		element.click();
	//	((JavascriptExecutor) driver).executeScript("arguments[0].click", element);
		
		Alert promptAlert=driver.switchTo().alert();
		System.out.println("Alert Description"+promptAlert.getText());
		promptAlert.sendKeys("Accepting the alert");
		Thread.sleep(10000);
		promptAlert.accept();
		driver.close();
		
		
		
		
		
	}

}
