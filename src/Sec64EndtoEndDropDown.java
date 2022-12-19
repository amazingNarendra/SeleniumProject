import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sec64EndtoEndDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");	
		
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(1000);
		
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='HYD']")).click();
		
		d.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		d.findElement(By.cssSelector("body > form:nth-child(1) > div:nth-child(12) > div:nth-child(2) > div:nth-child(1) > div:nth-child(17) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(6)")).click();
       
		d.findElement(By.cssSelector("a[title='Prev']")).click();
		d.findElement(By.cssSelector("a[class*='ui-state-default ui-state-highlight']")).click();

	}

}
