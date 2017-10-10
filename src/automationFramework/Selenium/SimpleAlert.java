package automationFramework.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert Description"+simpleAlert.getText());
		simpleAlert.accept();
		driver.close();
	}

}
