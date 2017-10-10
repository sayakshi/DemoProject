package automationFramework.Selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
				String handle=driver.getWindowHandle();
				System.out.println("Current Handle Name"+handle );
				// driver.findElement(By.name("New Message Window")).click();
				Set handle1 = driver.getWindowHandles();
				System.out.println("Current Handle Name"+handle1);
				for(String i: driver.getWindowHandles())
				{
					System.out.println("Current Window"+i);
					driver.switchTo().window(i);
					
				}
				
				driver.close();
				driver.quit();
				

	}

}
