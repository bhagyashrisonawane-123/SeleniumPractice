package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon 
{
	public static void main(String[] args)
	{
		String driverPath1 = System.getProperty("user.dir");
		
		String chromeExePath = driverPath1 + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amezon.in/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Application Title is: " + pageTitle);
		System.out.println("Application Title Length is: " + pageTitle.length());
		System.out.println("Application Title Status is : " + pageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Application URL is: " + pageUrl);
		System.out.println("Application URL Status: " + pageUrl.equals("https:/www.amezon.in/"));
		System.out.println("\n");

		String pageContent = driver.getPageSource();
		
  //    System.out.println("Application Source is: " + pageContent);
		
		System.out.println("Application Source Length is: " + pageContent.length());
		
		driver.close();
		
	}

}
