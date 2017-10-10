package automationFramework.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWait {
	
	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[@id='timingAlert']")).click();
		System.out.println("Timing alert is clicked");
		WebDriverWait wait = new WebDriverWait(driver,10);
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either Popup is displayed or timed out");
		myalert.accept();
		driver.close();
	}
	

}