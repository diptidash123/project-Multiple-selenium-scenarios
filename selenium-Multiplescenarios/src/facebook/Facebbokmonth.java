package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebbokmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select sel=new Select(folder);
		//sel.selectByVisibleText("Apr");
		//sel.selectByVisibleText("Jan");
		sel.selectByVisibleText("Month");
		//sel.deselectAll();
		sel.deselectByValue("Month");
		
         java.util.List<WebElement> fort= sel.getOptions();
		   System.out.println(fort.size());
		   for(int i=0;i<fort.size();i++)
			 {
				 System.out.println(fort.get(i).getText());
			 }
	}

}
