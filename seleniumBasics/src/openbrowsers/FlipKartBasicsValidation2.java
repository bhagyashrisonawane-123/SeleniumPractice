package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//  By Using FireFox
public class FlipKartBasicsValidation2 
{
	public static void main(String[] args)
	{
	// Using System class
	String driverPath = System.getProperty("user.dir") + ".\\executables\\geckodriver.exe";
	
	// Set the driver executable path using System.setProperty(String Key, String Value)
	System.setProperty("webdriver.gecko.driver", driverPath);
	
	// Creating an Instance of required Browser class
	WebDriver driver = new FirefoxDriver();
	
	// Enter the URL
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	//  Validate Page Title
	String pageTitle = driver.getTitle();
	String expectedTitle = "IRCTC Next Generation eTicketing System";
	System.out.println("Title Validation: " + pageTitle.equals(expectedTitle));
	
	//  Validate Current URL
	String pagetUrl = driver.getCurrentUrl();
	String expectedUrl = "https://www.irctc.co.in/nget/train-search";
	System.out.println("Page on Validation: " + pagetUrl.equals(expectedUrl));

	//  Get Page source Content length count
	int contentLength = driver.getPageSource().length();
	System.out.println("Source content length: " + contentLength);
    
	//  close the Current Browser Instance
	driver.close();	
	}
}	


