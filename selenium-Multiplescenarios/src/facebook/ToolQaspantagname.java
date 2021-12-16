package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolQaspantagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/selectmenu/");
		WebElement folder=driver.findElement(By.xpath("//span[.='Medium']"));
		Select sel=new Select(folder);
		System.out.println(sel.isMultiple());
		//sel.selectByVisibleText("Medium");
		//sel.selectByVisibleText("Faster");
		//sel.selectByVisibleText("Fast");
	}

}
