package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaMicromaxMb 
{
	public static void main(String[] args)
	{
		String driverpath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/micromax-phones-66.php");
		
		List<WebElement> deviceName = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		
		System.out.println("Total Count of Micromax: " + deviceName.size());
		
		for(int i = 0; i < deviceName.size(); i++)
		{
			System.out.println(deviceName.get(i).getText());
		}
	}

}
