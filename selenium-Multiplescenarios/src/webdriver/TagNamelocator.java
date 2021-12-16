package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamelocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dipti%20Dash/Downloads/TagName.html");
		driver.findElement(By.tagName("input")).sendKeys("papu");

	}

}
