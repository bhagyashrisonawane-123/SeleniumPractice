package propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class GsmAreanaSonyPhonesNames
{
	public static void main(String[] args) throws InterruptedException
	{
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		
		WebDriver driver = new ChromeDriver();
		
		// maximize browser window
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.gsmarena.com/sony-phones-7.php");
		
		List<WebElement> paginationLinks = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));

		System.out.println(paginationLinks.size());
		
		if(paginationLinks.size() > 0)
		{
			System.out.println(" Pagination exist..... ");
		}
		
		for(int i = 0; i < paginationLinks.size(); i++) 
		{
			Wait.until(ExpectedConditions.elementToBeClickable(paginationLinks.get(i)));
			
			paginationLinks.get(i).click();
			
			System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(2000);
			
			paginationLinks = driver.findElements(By.cssSelector(""));
		}
	}


}
