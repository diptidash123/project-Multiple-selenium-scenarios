package clickoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Controlclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com");
		WebElement essentials=driver.findElement(By.xpath("//a[.='Essentials']"));
		Actions act=new Actions(driver);
		act.moveToElement(essentials).perform();
		WebElement mask=driver.findElement(By.xpath("//a[.='Masks']"));
		act.sendKeys(Keys.CONTROL).click(mask).perform();
		//act.sendKeys(Keys.CONTROL);
		act.sendKeys(Keys.TAB);
		System.out.println(driver.getTitle());
	}

}
