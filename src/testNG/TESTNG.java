package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TESTNG {

	public WebDriver driver;

	@Test
	public void main() {

		try
		{
				WebElement Signin= driver.findElement(By.xpath("//a[contains(.,'Sign In')]"));
				if (Signin.isEnabled())
				{
					
					Signin.click();
				}
		}
		catch(Exception e)
		{
			System.out.println("Signin Not found");
			
		}

		// EnterUser
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sayantan.indu@gmail.com");
		// click on next
		driver.findElement(By.xpath("//input[@id='next']")).click();

		// EnterPassword
		driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("l0vey0ud@");

		// click on sign in
		driver.findElement(By.xpath("//input[@id='signIn']")).click();

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(@class,'9a gbii')]")));
			element.click();
			driver.findElement(By.xpath("//a[contains(.,'Sign out')]")).click();;
		}

		catch (Exception e) {
			System.out.println("Couldn't find signin element");

		}

	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new FirefoxDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch Website

		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
