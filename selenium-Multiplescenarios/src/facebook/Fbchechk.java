package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbchechk 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select sel=new Select(folder);
		System.out.println(sel.isMultiple());*/
		
		driver.navigate().to("https://demo.actitime.com/administration/btlist.do");
		WebElement folder=driver.findElement(By.xpath("//select[@name='Week']"));
		Select sel=new Select(folder);
		System.out.println(sel.isMultiple());

}
}
