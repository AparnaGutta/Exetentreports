import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toprateloop2 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
	System.setProperty("webdriver.chrome.driver", "C:\\PageObjectModel\\Practice\\drivers\\chromedriver.exe");	
	
		driver=new ChromeDriver();
		driver.get("http://localhost/colour/best_rated.php");
		List<WebElement> a = driver.findElements(By.xpath("(((//table[3]/tbody/tr))/td[4])"));
		System.out.println(a.size());
		for(int i=1;i<=a.size();i++)
		{
			String adname=driver.findElement(By.xpath("(((//table[3]/tbody/tr["+(i+1)+"]))/td[2])")).getText();
			driver.findElement(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]"));
			List<WebElement> b = driver.findElements(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]//img[contains(@src,'full')]"));
			//System.out.println(b.size());
			int e = b.size();
			List<WebElement> c = driver.findElements(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]//img[contains(@src,'half')]"));
			//System.out.println(c.size());
			int f = c.size();
			List<WebElement> d = driver.findElements(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]//img[contains(@src,'empty')]"));
			//System.out.println(d.size());
			int g = d.size();
			int totalgrade=((e*2)+(f*1)+(g*0));
			System.out.println("The grade given forr "+adname+" add is : "+totalgrade);
			
		}
	}

}
