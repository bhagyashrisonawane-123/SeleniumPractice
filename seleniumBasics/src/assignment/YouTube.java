package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		//   By Using Url
		String actualUrl = driver.getCurrentUrl();
		System.out.println("YouTube Url Validation is: " + actualUrl.equals("https://www.makemytrip.com/"));
		
		//   By Using Title
		String pageTitle = driver.getTitle();
		String expectedTitle = "Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip";
		System.out.println("Application Title is: " + pageTitle);
		System.out.println("Application Length is: " + pageTitle.length());
        
		if(pageTitle.equals(expectedTitle))
		{
			System.out.println("Title page is opened successfully....");
		}
		else 
		{
			System.out.println("Title page is not opened successfully....");
		}
		//   By Using Source Length
		String sourceContent = driver.getPageSource();
		System.out.println("Source Content Length: " + sourceContent.length());
		
		driver.close();
		
	}

}
