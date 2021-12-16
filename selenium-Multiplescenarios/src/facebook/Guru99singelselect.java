package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99singelselect 
{

	public static void main(String[] args) 
	{

				System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://demo.guru99.com/selenium/newtours/register.php");
				WebElement folder=driver.findElement(By.xpath("//select[@name='country']"));
				Select sel=new Select(folder);
				//sel.selectByVisibleText("AUSTRALIA");
				sel.selectByVisibleText("BANGLADESH");
				//sel.selectByVisibleText("ARGENTINA");
				//sel.selectByIndex(10);
				//sel.selectByValue("BASSA DE INDIA");
				//sel.deselectAll();
				/*List<WebElement> fort=sel.getOptions();
				System.out.println(fort.size());
				for(int i=0;i<fort.size();i++)
				{
					System.out.println(fort.get(i).getText());
				}*/
				
				List<WebElement> fort=sel.getAllSelectedOptions();
				System.out.println(fort.size());
				for(int i=0;i<fort.size();i++)
				{
					System.out.println(fort.get(i).getText());
				}
	}

}
