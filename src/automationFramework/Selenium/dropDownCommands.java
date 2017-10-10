package automationFramework.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://toolsqa.wpengine.com/automation-practice-form/");
		// Put an Implicit wait,
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select iContinents = new Select(driver.findElement(By.id("continents")));
		// Selecting Europe
		iContinents.selectByIndex(1);
		// Selecting by visibletext
		iContinents.selectByVisibleText("Africa");
		
		

		// printing all values

		List<WebElement> iContinentOptions = iContinents.getOptions();
		for (int i = 0; i < iContinentOptions.size(); i++) {
			System.out.println(iContinentOptions.get(i).getText());
		}
		driver.close();

	}

}
