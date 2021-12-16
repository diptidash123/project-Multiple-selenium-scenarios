package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.actitime.com/login.do");
		WebElement link=driver.findElement(By.linkText("Forgot your password?"));
		System.out.println(link.getText());
		link.click();*/
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement link=driver.findElement(By.partialLinkText("Forgot your password?"));
		System.out.println(link.getText());
		link.click();
		
	}

}
