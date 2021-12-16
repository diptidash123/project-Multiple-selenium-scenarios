package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enterlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("dipti");
		WebElement user1=driver.findElement(By.xpath("//input[@id='pass']"));
		user1.sendKeys("dash");
		user.sendKeys(Keys.CONTROL.ENTER);
		
		
	}

}
