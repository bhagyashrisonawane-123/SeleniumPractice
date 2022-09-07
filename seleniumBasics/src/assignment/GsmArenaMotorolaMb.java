package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaMotorolaMb 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/motorola-phones-4.php");
		
		driver.manage().window().setSize(new Dimension(600,650));
		
		List<WebElement> deviceName = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		
		System.out.println("Total Count of Motorola: " + deviceName.size());
		
		for(int i = 0; i < deviceName.size(); i++)
		{
			System.out.println(deviceName.get(i).getText());
		}
		
	}

}
