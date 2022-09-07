package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) 
	{
String driverpath = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector(".InyRMC>div>div:nth-of-type(4)"));
		
		
		List<WebElement> allOptions = driver.findElements(By.cssSelector(".InyRMC >div"));
		
		System.out.println("Total Identified Element: " + allOptions.size());
		
		for(int i = 0; i < allOptions.size(); i++)
		{
			WebElement option = allOptions.get(i);
			String name = option.getText();
			System.out.println("Option Name: " + name);
			
			if(name.equals("Fashion"))
			{
				option.click();
				break;
				
			}     else  {
				System.out.println("Not Matched.......");
				
			}
		}
		
		driver.navigate().back();
		
	}

}
