package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GenericWayToChrome 
{
	public static void main(String[] args)
	{
		String currentWorkingDir = System.getProperty("user.dir");
		
		String chromeExePath = currentWorkingDir + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		// ChromeDriver cdriver = new ChromeDriver();              or
		// Creating an Instance of Chrome Browser & up-casting it to WebDriver Interface
		
		WebDriver driver = new ChromeDriver();
		
		// To Enter the URL on the Open Browser
		driver.get("https://www.google.com");
		
		String appCurrentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.google.com/";
		System.out.println("Actual URL: " + appCurrentUrl);
		System.out.println("Expected URL: " + expectedUrl);
		
		if(appCurrentUrl.contains(expectedUrl)) {
			System.out.println("Current URL Validation is Passed");
		} else {
			System.out.println("Current URL Validation is failed");
		}
		
		//  Verify that Google search page is opened or not using Title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		System.out.println("Actual Title: " + actualTitle);
		System.out.println("Expected Title: " + expectedTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title Validation is Passed");
		} else {
			System.out.println("Title Validation is not failed");
		}
		
		// Get the web page source content
		String sourceContent = driver.getPageSource();
		System.out.println("Source content length : " + sourceContent.length());
	
		driver.close();	
	}


}
