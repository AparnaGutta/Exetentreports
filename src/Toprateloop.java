import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toprateloop {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
	System.setProperty("webdriver.chrome.driver", "C:\\PageObjectModel\\Practice\\drivers\\chromedriver.exe");	
	
		driver=new ChromeDriver();
		driver.get("http://localhost/colour/best_rated.php");
		List<WebElement> a = driver.findElements(By.xpath("//table[3]/tbody/tr"));
		int b = a.size();
		for(int i=2;i<b;i++)
		{
			WebElement c = driver.findElement(By.xpath("((//table[3]/tbody/tr["+i+"])/td[4])/a"));
			System.out.println(c.getText());
			//c.click();
		}
		

	}

}
