package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentis
{
	public static void main(String[] args)
	{
		String currentWorkingDir = System.getProperty("user.dir");
		
		String chromeExePath = currentWorkingDir + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tricentis.com/");
		
		//   By Using Title
		String pageTitle = driver.getTitle();
		String expectedTitle = "Automated Software Testing Tools | Tricentis";
		System.out.println("Page title is: " + pageTitle);
		System.out.println("Page title Length is: " + pageTitle.length());
		System.out.println("Page title status is: "+pageTitle.equals(expectedTitle));
		
		//   By Using URL
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is: " + pageURL);
	    System.out.println("Page URL status is: " + pageURL.equals("https://www.tricentis.com/"));
	   
	    //   By Using Page Source
	    String pageContent = driver.getPageSource();
		//   System.out.println("Page Source is: "+pageContent);
	    System.out.println("Page Source Length is: " + pageContent.length());
	    
	    driver.close();
	    
	}

}
