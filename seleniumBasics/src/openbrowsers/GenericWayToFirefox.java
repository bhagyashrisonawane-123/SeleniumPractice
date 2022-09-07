package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToFirefox 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.agoda.com/");
		
		// By Using Url
		String appCurrentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.agoda.com/";
		System.out.println(" Actual Url : " + appCurrentUrl);
		System.out.println(" Expected Url : " + expectedUrl);
		
		// By Using Title
		String pageTitle = driver.getTitle();
		String expectedTitle = "Agoda Official Site | Free Cancellation & Booking Deals | Over 2 Million Hotels";
		
		System.out.println("Title Validation : " + pageTitle.equals(expectedTitle));
		
		// By Using 
		String sourceContent = driver.getPageSource();
		System.out.println("Source Content Length : " + sourceContent.length());
		
		driver.close();
	}

}
