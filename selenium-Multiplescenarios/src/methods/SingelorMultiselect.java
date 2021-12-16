package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingelorMultiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Dipti%20Dash/Desktop/SelectClass.html");
		WebElement folder=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(folder);
		//System.out.println(sel.isMultiple());
		//System.out.println(sel.isMultiple());
		List<WebElement> fort=sel.getOptions();
		System.out.println(fort.size());
		
		for(int i=0;i<fort.size();i++)
		{
			System.out.println(fort.get(i).getText());
		}
		
	}

}
