package seleniumWait;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//     By Using Css-Selector

public class Amazon {

	public static void main(String[] args) 
	{

		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(11)"));
		
		List<WebElement> allOptions = driver.findElements(By.cssSelector("#nav-xshop>a"));
		
		//  We want to Print Multiple Elements by using =====> "size()"
		System.out.println("Total Identified Elements: " + allOptions.size());
		
		for(int i = 0; i < allOptions.size(); i++)
		{
			WebElement option = allOptions.get(i);
			String name = option.getText();
			System.out.println("Option Name: " + name);
			
			if(name.equals("Amazon Pay"))
			{
				option.click();
				break;
				
			}   else  {
				System.out.println("Not Matched.......");
				
			}
		}
		
		driver.navigate().back();
		

	}

}
