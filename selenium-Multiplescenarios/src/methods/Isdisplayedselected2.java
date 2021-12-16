package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayedselected2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		System.out.println(folder.isDisplayed());
		System.out.println(folder.isEnabled());
		folder.click();
		System.out.println(folder.isSelected());
	}

}
