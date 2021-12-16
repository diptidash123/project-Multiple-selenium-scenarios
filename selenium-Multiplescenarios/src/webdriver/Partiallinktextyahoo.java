package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktextyahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        WebElement  link1= driver.findElement(By.partialLinkText("Forgot username?"));
        System.out.println(link1.getText());
        link1.click();
	}

}
