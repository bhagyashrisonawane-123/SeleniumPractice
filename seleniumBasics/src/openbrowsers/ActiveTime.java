package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveTime 
{
	public static void main(String[] args)
	{
		// Using System class
		String driverPath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		// Set the driver executable path using Systeem.setProperty(String Key,String Value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		
		//    By using Title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is: " + pageTitle);
		System.out.println("Page Title Length: " + pageTitle.length());
		
		String expectedTitle = "actiTIME - Login";
		System.out.println("Title Validation Status is: " + pageTitle.equals(expectedTitle));
		System.out.println("\n");
		
		
        //	  By Using Url
			String pageUrl = driver.getCurrentUrl();
			System.out.println("Page URL is: " + pageUrl);
			
			String expectedUrl = "https://demo.actitime.com/login.do";
			System.out.println("URL Validation Status: " + pageUrl.contains(expectedUrl));
			System.out.println("\n");
		
			
		//    By Using Source Length
		String pageSource = driver.getPageSource();
		//System.out.println("Source content length: "+contentLength);
		System.out.println("Page Source Length: " + pageSource.length());
		driver.close();
	}

	
	/*  Answer:- Page url validation: true*/
}
