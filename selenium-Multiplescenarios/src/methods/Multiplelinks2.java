package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dipti%20Dash/Desktop/MultipleElements.html");
		List<WebElement> folder=driver.findElements(By.xpath("//a"));
		System.out.println(folder.size());
		//folder.get(2).click();
		
		
		for(int i=0;i<folder.size();i++)
		{
			System.out.println(folder.get(i).getText());
			System.out.println(folder.get(i).getAttribute("href"));
		}
		
	}

}
