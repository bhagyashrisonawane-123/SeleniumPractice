package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaSonyMb 
{
	public static void main(String[] args)
	{
		String driverpath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(400,500));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/sony-phones-7.php");
		
		driver.navigate().refresh();
		
		List<WebElement> deviceName = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		
		System.out.println("Total Xiaomi Mobile Counts: " + deviceName.size());
		
		for(int i = 0; i < deviceName.size(); i++) 
		{
			System.out.println(deviceName.get(i).getText());
		}
		
	}

}
