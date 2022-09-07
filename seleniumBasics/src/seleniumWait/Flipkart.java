package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(500,600));
		
		driver.manage().window().maximize();
		
		driver.get("");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By(""));
		
		List<WebElement> allOptions = new driver.findElements(By(""));
		
	}

}
