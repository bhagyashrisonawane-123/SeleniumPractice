package openbrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToGoogle 
{
	public static void main(String[] args)
	{
		String currentWorkingDir = System.getProperty("user.dir");
		
		String chromeExePath = currentWorkingDir + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		
		// ChromeDriver cdriver = new ChromeDriver();              or
		
		// Creating an Instance of Chrome Browser & up-casting it to WebDriver Interface
		
		WebDriver driver = new ChromeDriver();
		
		// To Enter the URL on the Open Browser
		driver.get("https://www.google.com/");
		
		driver.close();	
	}

}
