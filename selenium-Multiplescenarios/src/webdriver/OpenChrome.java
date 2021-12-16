package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();

	}

}
