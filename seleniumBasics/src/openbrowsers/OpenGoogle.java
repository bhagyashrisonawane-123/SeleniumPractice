package openbrowsers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogle 
{
	public static void main(String[] args)
	{
		//  Open Chrome Browser
		//  Step 1 :- Executable Path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		//  Create an Instance of Required Browser
		WebDriver driver = new ChromeDriver();
		
		//  Enter google URL
		driver.get("https://www.google.com/");
		
		String sourceCode = driver.getPageSource();
		System.out.println("Application source code is: " + sourceCode);
		System.out.println("source code Length is: " + sourceCode.length());
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Application Current URL: " + driver.getCurrentUrl());
		
		String pageTitle = driver.getTitle();
		System.out.println("Application Current Title: " + driver.getTitle());
		
		//  Close Current Instance of Browser
		driver.close();
	}

}
