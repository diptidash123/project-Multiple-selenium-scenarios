package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontainsActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();   
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Types of Work']")).click();
        driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
        driver.findElement(By.id("name")).sendKeys("Bahu");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(6000);
        //dependent indepenedent xpath is not getting deleted popup
       // driver.findElement(By.xpath("//a[.='Bahu']/../..//a[@href='javascript:deleteType(32);']")).click();
        
        driver.findElement(By.xpath("//a[.='Bahu']/../..//a[contains(text(),'delete')]")).click();
	}

}
