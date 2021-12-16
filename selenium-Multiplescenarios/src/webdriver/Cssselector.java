package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("file:///C:/Users/Dipti%20Dash/Desktop/Demo.html");
		driver.get("https://wwww.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("dipti");
		driver.findElement(By.cssSelector("input[data-testid=royal_pass]")).sendKeys("dash");

	}

}
