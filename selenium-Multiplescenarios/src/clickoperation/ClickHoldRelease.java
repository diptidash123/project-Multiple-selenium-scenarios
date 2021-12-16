package clickoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldRelease {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		Actions fort=new Actions(driver);
		fort.clickAndHold(folder).perform();
		Thread.sleep(3000);
		fort.release(folder).perform();
	}

}
