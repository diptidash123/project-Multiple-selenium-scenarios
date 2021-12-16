package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookday {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select sel=new Select(folder);
		sel.selectByVisibleText("Day");
	    sel.selectByIndex(5);
	    sel.selectByValue("7");
	    //sel.selectByVisibleText("Day");
	    //sel.deselectByVisibleText("Day");
	    
	    //List<WebElement> fort=sel.getOptions();
	   // System.out.println(fort.size());
		/* for(int i=0;i<fort.size();i++)
		 {
			 System.out.println(fort.get(i).getText());
		 }*/
	  
	    List<WebElement> fort=sel.getAllSelectedOptions();
		for(int i=0;i<fort.size();i++)
		 {
			 System.out.println(fort.get(i).getText());
		 }
	    

	}

}
