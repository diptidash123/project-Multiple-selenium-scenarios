package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookyear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement folder=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select sel=new Select(folder);
        List<WebElement> fold=sel.getOptions();
		System.out.println(fold.size());
		for(int i=0;i<fold.size();i++)
		{
					System.out.println(fold.get(i).getText());
		}
	}

}
