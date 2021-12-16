package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleelementreferenceexception {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement link=driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(link.getText());
		link.click();
		System.out.println(link.getText());
		
		WebElement link1=driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(link1.getText());
		link.click();
		System.out.println(link1.getText());

	}

}
