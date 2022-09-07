package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTaskCreation 
{

	public static void main(String[] args) 
	{
		String chromeExePath = System.getProperty("user.dir") + ".\\Executables\\chromedriver.exe";
		
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.findElement(By.id("container_tasks")).click();
		
		List<WebElement> taskNames = driver.findElements(By(" .taskRowsTable .names .title"));
		
		List<String> taskList = new ArrayList<String>();
		for(WebElement task: taskNames)
		{
			taskList.add(task.getText());
		}
		
		System.out.println(taskList.contains("3D modelling"));
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing");

	}


}
