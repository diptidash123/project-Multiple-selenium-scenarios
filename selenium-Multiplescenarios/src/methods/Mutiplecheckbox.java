package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mutiplecheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dipti%20Dash/Desktop/MultipleElements.html");
	    List<WebElement> folder=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    System.out.println(folder.size());
	    
	    Thread.sleep(3000);
	  /*for(int i=0;i<folder.size();i++)
	    {
	    	folder.get(i).click();
	    }*/
	    
	 /* for(int i=1;i<folder.size();i+=2)
	    {
	    	folder.get(i).click();
	    }*/
	    
	    for(int i=folder.size()-1;i>=0;i-=2)
	    {
	    	folder.get(i).click();
	    }
	}

}
