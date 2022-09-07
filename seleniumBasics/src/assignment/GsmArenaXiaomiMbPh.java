package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaXiaomiMbPh 
{
	public static void main (String[] args)
	{
		
	String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("https://www.gsmarena.com/xiaomi-phones-80.php");
	
	List<WebElement> deviceNames = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
	
	System.out.println("Total Xiaomi Mobile Counts: " + deviceNames.size());
	
	for(int i = 0; i < deviceNames.size(); i++) 
	{
		System.out.println(deviceNames.get(i).getText());
	}
	
	}

}
