package clickoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com");
		WebElement essentials=driver.findElement(By.xpath("//a[.='Essentials']"));
		Actions fort=new Actions(driver);
		fort.moveToElement(essentials).perform();
		WebElement mask=driver.findElement(By.xpath("//a[.='Masks']"));
		fort.moveToElement(mask).click(mask).perform();
	}

}
