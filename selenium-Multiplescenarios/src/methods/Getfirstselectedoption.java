package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getfirstselectedoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Dipti%20Dash/Desktop/SelectClass.html");
		WebElement folder=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(folder);
		sel.selectByVisibleText("Australia");
		sel.selectByVisibleText("Canada");
		sel.selectByVisibleText("United States");
		WebElement fort=sel.getFirstSelectedOption();
		System.out.println(fort.getText());
	}

}