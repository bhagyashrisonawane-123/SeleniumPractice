package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

          /*    By Using Css-Selector     */

          //     Mobile      //

public class AmazonMobile 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(2)")).click();
		
		driver.navigate().back();
		
		}

}
