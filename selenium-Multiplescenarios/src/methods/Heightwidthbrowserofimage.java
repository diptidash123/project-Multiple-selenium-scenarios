package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightwidthbrowserofimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.gsmarena.com");
		WebElement folder=driver.findElement(By.xpath("//img[@src='https://fdn.gsmarena.com/imgroot/reviews/20/motorola-moto-g8-power/-728x314/thumb3.jpg']"));
		System.out.println(folder.getSize().getHeight());
		System.out.println(folder.getSize().getWidth());
	}

}
