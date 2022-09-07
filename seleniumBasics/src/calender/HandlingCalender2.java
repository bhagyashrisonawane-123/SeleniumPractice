package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalender2 
{
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir") + ".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//  Select the 
		driver.findElement(By.id("src")).sendKeys("pune");
		WebElement src = driver.findElement(By.cssSelector(".homeSearch>*:nth-child(5)"));
		wait.until(ExpectedConditions.elementToBeClickable(src));
		src.click();
		
		//  Select the Destination
		driver.findElement(By.id("dest")).sendKeys("Goa");
		WebElement dest = driver.findElement(By.cssSelector(".homeSearch>*:nth-child(4)"));
		wait.until(ExpectedConditions.elementToBeClickable(dest));
		dest.click();
		
	    //  select any date , next , Next month 
		driver.findElement(By.xpath("#onward_cal")).click();
		driver.findElement(By.cssSelector(".next>button")).click();
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-of-type(4)>*:nth-of-type(5)")).click();
		
		//   Click on Search
		driver.findElement(By.id("search_btn")).click();
		
		//   Departure Time
		driver.findElement(By.xpath("//div[div[text()='DEPARTURE TIME']]/ul[2]/li[4]/label[1]")).click();
		
		//   Bus Type
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebElement busType = driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait.until(ExpectedConditions.elementToBeClickable(busType));
		busType.click();
		
		List<WebElement> busList = driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(1)>*:first-child"));
		List<WebElement> busPrice = driver.findElements(By.cssSelector(".bus-item-details>div.row-one>div:nth-of-type(6)>div>div.fare>span"));
		
		for(int i = 0; i < busList.size(); i++)
		{
			System.out.println(busList.get(i).getText() + ":---->" + busPrice.get(i).getText());
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		}
	}

}
