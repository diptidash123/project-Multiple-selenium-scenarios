package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOrNot 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		//if(title.equals("Google"))
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("pass");
					
		}
		else
		{
			System.out.println("fail");
		}

	}

}
