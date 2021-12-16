package clickoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.xpath("(//div[.='Washington'])[2]"));
		//WebElement Target=driver.findElement(By.xpath("//div[.='United States']"));
		WebElement Target=driver.findElement(By.xpath("//div[.='Spain']"));
		Actions fort=new Actions(driver);
		fort.dragAndDrop(source, Target).perform();
		
	}

}
