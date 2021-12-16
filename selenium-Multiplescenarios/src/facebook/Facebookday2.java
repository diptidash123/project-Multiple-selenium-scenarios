package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookday2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(folder);
		//System.out.println(sel.isMultiple());
		//Thread.sleep(5000);
		sel.selectByVisibleText("Day");
		sel.selectByIndex(3);
		sel.selectByValue("2");
		//sel.deselectAll();
		//sel.selectByVisibleText("dipti");
		
		/*List<WebElement> fort=sel.getOptions();
		System.out.println(fort.size());
		for(int i=0;i<fort.size();i++)
		{
			System.out.println(fort.get(i).getText());
		}*/
		
		
		List<WebElement> fort1=sel.getAllSelectedOptions();
		System.out.println(fort1.size());
		for(int i=0;i<fort1.size();i++)
		{
			System.out.println(fort1.get(i).getText());
		}

		
	}

}
