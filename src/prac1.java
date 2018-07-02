import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prac1 {

	public static void main(String[] args)
	{
	 WebDriver driver;
	 
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 
	driver.get("http://localhost/colour/");
	WebElement dd = driver.findElement(By.xpath("//select[contains(@name,'catid')]"));
	dd.click();
	
	Select ab=new Select(dd);
	List<WebElement> a = ab.getOptions();
	int b = a.size();
	for(int i=0;i<b;i++)
	{
		System.out.println(a.get(i).getText());
	}	
		

	}

}
