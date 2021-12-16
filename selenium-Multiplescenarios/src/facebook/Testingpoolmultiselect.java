package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testingpoolmultiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		WebElement folder=driver.findElement(By.xpath("//select[@name='Week']"));
		Select sel=new Select(folder);
		sel.selectByVisibleText("Monday");
		sel.selectByVisibleText("Tuesday");
		sel.selectByVisibleText("Saturday");
		sel.selectByIndex(4);
		sel.selectByValue("Tue");
		//sel.deselectAll();
		//sel.deselectByVisibleText("Monday");
		sel.deselectByIndex(5);
		sel.deselectByValue("Mon");
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
