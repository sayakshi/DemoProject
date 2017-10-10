package automationFramework.Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		String url= "http://store.DemoQA.com";
		driver.get(url);	
		String Title = driver.getTitle();
		int TitleLength=driver.getTitle().length();
		System.out.println("PageTitle"+ Title+"\tPage Length"+TitleLength);
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Actual Url"+actualUrl);
		if (url.equals(actualUrl))
			{
				System.out.println("URL matched");
			
			}
		else
		{
			
			System.out.println("URL don't match");
		}
		Thread.sleep(5);
		driver.close();
			
		

	}

}
