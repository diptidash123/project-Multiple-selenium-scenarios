package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		//System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);

	}

}
