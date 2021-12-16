package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextmyntraessential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.myntra.com");
        //driver.findElement(By.xpath("//a[text()='Essentials']")).click();
        driver.findElement(By.xpath("//a[.='Essentials']")).click();
        

	}

}
