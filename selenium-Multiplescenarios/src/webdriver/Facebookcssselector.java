package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        /*driver.get("https://www.facebook.com");
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("dipti");
        driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("dash");*/
		
		driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("dipti");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("dash");
		
	}

}
