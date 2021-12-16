package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontainsusnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qspiders.com/contact");
		/*WebElement folder=driver.findElement(By.xpath("//div[contains(text(),'+1 (415) 429-3957')]"));
		System.out.println(folder.getText());*/
		
		WebElement folder=driver.findElement(By.xpath("//div[contains(text(),'+91-7077702027')]"));
		System.out.println(folder.getText());
	}

}
