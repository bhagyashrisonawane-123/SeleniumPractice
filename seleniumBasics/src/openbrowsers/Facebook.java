package openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is: " + pageTitle);
		System.out.println("Page Title Length is: " + pageTitle.length());
		
		String expectedTitle = "Facebook – log in or sign up";
		System.out.println("Page Title Validation: " + pageTitle.equals(expectedTitle));
		
		
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page Url is: " + pageURL);
		
		driver.close();
	}

}
