package automationFramework.Selenium.Frames;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.FireEvent;

public class TotalFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		//Java ScriptExecutor
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		Integer numberOfFrames = Integer.parseInt(jse.executeScript("return window.length").toString());
		//Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of frames"+ numberOfFrames);
		driver.findElement(By.cssSelector(selector))
		
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames"+ iframeElements.size());
		
		
		
		

	}

}
