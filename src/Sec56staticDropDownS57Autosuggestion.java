import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sec56staticDropDownS57Autosuggestion{

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://rahulshettyacademy.com/dropdownsPractise/");	
			
			d.findElement(By.id("divpaxinfo")).click();
			
			Thread.sleep(5000);
			System.out.println(d.findElement(By.id("divpaxOptions")).isEnabled());
//			Select s=new Select(d.findElement(By.id("hrefIncAdt")));
			for(int i=1;i<3;i++)
			{
			d.findElement(By.id("hrefIncAdt")).click();
//			d.findElement(By.className(""))
			d.findElement(By.id("hrefIncInf")).click();
			}
			d.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(d.findElement(By.id("divpaxinfo")).getText());
			System.out.println(" 1st Success");
			
//			AutoSuggest(d);
			System.out.println(" 2nd Success");
			d.close();
			
					

	}
	
	
	public static void AutoSuggest(WebDriver d) throws InterruptedException {
		d.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(1000);
		List<WebElement> options=d.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
				
		for(WebElement o:options) {
			if(o.getText().equalsIgnoreCase("india")){
				o.click();
				break;
			}
		}
			
	}

}
