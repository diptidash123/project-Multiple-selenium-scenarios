package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifelsefbchechk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement you=driver.findElement(By.xpath("//input[@id='pass']"));
		you.sendKeys("dipti");
		System.out.println(you.getText());
		
		/*if(you.equals("Dipti"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}*/
	
		
	}

}
