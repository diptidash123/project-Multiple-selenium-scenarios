package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Removetextwithoutclearmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*WebElement folder=driver.findElement(By.id("email"));
		folder.sendKeys("dipti");
		folder.sendKeys(Keys.BACK_SPACE);*/
		
		WebElement folder=driver.findElement(By.id("email"));
		folder.sendKeys("dipti");
		folder.sendKeys(Keys.CONTROL,"a");
		//folder.sendKeys(Keys.BACK_SPACE);
		folder.sendKeys(Keys.DELETE);
		
		
		
	}

}
