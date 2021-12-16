package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigntrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String link=driver.getTitle();
		if(link.equals("Google"))
		//if(link.equalsIgnoreCase("google"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
