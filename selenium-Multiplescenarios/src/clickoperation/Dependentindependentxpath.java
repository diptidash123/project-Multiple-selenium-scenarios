package clickoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependentindependentxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		//WebElement folder=driver.findElement(By.xpath("//b[.='Scarlett Johansson']/../..//li[2]"));
		//System.out.println(folder.getText());
		
		//scarlet problem
		//WebElement folder=driver.findElement(By.xpath("//b[.='Scarlett Johansson']/../..//li[2]"));
		//System.out.println(folder.getText());
		
		
		
		
		
	}

}
