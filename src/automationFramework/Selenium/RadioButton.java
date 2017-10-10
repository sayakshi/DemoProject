package automationFramework.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://toolsqa.wpengine.com/automation-practice-form/");
		Thread.sleep(5);
		List<WebElement> sexRadio=driver.findElements(By.id("sex-0"));
		Boolean femaleRadio= sexRadio.get(0).isSelected();
		System.out.println(femaleRadio);
		if(femaleRadio.equals(false))
		{
			
			sexRadio.get(0).click();
			Boolean femaleRadionew= sexRadio.get(0).isSelected();
			System.out.println(femaleRadionew);
			
		}
		
		System.out.println("Clicking Exp");
		List<WebElement> yearExp=driver.findElements(By.id("exp-2"));
		yearExp.get(0).click();
		
		Thread.sleep(5000);
		System.out.println("Clicking Profession");
		List<WebElement> iProf=driver.findElements(By.name("profession"));
		
		for(int i=0;i<iProf.size();i++)
		{
			String sValue= iProf.get(i).getAttribute("value");
			if(sValue.equals("Automation Tester"))
			{
				iProf.get(i).click();
				
			}
				
		}
		Thread.sleep(5000);	
		
		driver.close();
		
		
	}

}
