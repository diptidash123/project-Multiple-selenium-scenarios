package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//input[@name='firstname']"));
		/*folder.sendKeys("dipti");
		folder.sendKeys(Keys.CONTROL,"a");
		folder.sendKeys(Keys.DELETE);*/
	    /*folder.sendKeys(Keys.BACK_SPACE);
		folder.sendKeys(Keys.BACK_SPACE);
		folder.sendKeys(Keys.BACK_SPACE);*/
		//folder.sendKeys(Keys.CONTROL,"a");
		//folder.clear();
		//folder.sendKeys(Keys.INSERT,"PTI");
		//folder.sendKeys(Keys.CONTROL,"a");
		//folder.sendKeys(Keys.INSERT,"DI");
		folder.sendKeys(Keys.INSERT,"DIPTI");
		folder.sendKeys("DIPTI");
		folder.sendKeys(Keys.CONTROL,"a");
		folder.sendKeys(Keys.DELETE);
		folder.sendKeys(Keys.INSERT,"dipti");
	}

}
