package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyActitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("diptiranjan");
		driver.findElement(By.name("pwd")).sendKeys("dash");
		String link=driver.getTitle();
		if(link.equals("Login page"))
		//if(link.equalsIgnoreCase("login page"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
				
			
			
		
		
	}

}
