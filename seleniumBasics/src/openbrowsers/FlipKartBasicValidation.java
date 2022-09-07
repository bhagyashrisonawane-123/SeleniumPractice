package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartBasicValidation 
{
	public static void main(String[] args)
	{
	// Using System class
	String driverPath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
	
	// Set the driver executable path using System.setProperty(String Key, String Value)
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	// Creating an Instance of required Browser class
	WebDriver driver = new ChromeDriver();
	
	// Enter the URL
	driver.get("https://www.flipkart.com/");
	
	//  Validate Page Title
	String pageTitle = driver.getTitle();
	String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	System.out.println("Title Validation: " + pageTitle.equals(expectedTitle));
	
	//  Validate Current URL
	String pageUrl = driver.getCurrentUrl();
	String expectedUrl = "https://www.flipkart.com/";
	System.out.println("Page Url Validation: " + pageUrl.equals(expectedUrl));

	//  Get Page source Content length count
	int contentLength = driver.getPageSource().length();
	System.out.println("Source content length: " + contentLength);
    
	//  close the Current Browser Instance
	driver.close();	
	}
}