package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dipti%20Dash/Desktop/Demo.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("dipti");
		driver.findElement(By.xpath("//input[2]")).sendKeys("dash");
	}

}
