package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args)
	{
		String driverPath1 = System.getProperty("user.dir");
		
		String chromeExePath = driverPath1 + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Application Title is: " + pageTitle);
		System.out.println("Application Title Length is: " + pageTitle.length());
		System.out.println("Application Title status is: " + pageTitle.equals("OrangeHRM"));
		
		String pageUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/";
		System.out.println("Application URL is: " + pageUrl);
		System.out.println("Application URL Status: " + pageUrl.contains(expectedUrl));
		System.out.println("\n");

		String pageContent = driver.getPageSource();
		 //    System.out.println("Application Source is: " + pageContent);
		
		System.out.println("Application Source Length is: " + pageContent.length());
		
		driver.close();
	}	

}
