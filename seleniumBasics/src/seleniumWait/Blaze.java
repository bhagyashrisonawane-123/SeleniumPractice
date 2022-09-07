package seleniumWait;

import java.util.ArrayList;

/*    By Using Css-Selector &  "List Of findElements"    */

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blaze {

	public static void main(String[] args) 
	{
        String path = System.getProperty("user.dir") + "F:\\Workspace\\seleniumBasics\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		
		System.out.println("Option count is: " + categories.size());
		
		//    Creating expected result list
		List<String> l1 = new ArrayList<String>();
		l1.add("CATEGORIES");
		l1.add("Phones");
		l1.add("Laptops");
		l1.add("Monitors");
		
		//    Logic to get one by one element from the list & performing validation on that
		
		for(int i = 0; i < categories.size(); i++)  
		{
			WebElement cat = categories.get(i);
			System.out.println("============ Element of List is: " + cat.getText() + "================");
			
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(l1.get(i)));
		}
		

	}

}
