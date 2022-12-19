package startFrom10Sec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Sec100ScrollingTableGridAndSec104SSLCert105 {
	public static void main(String[] args) {
//		DesiredCapabilities ch =DesiredCapabilities.chrome();
//		//ch.acceptInsecureCerts();
//		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c= new ChromeOptions();
//		c.merge(ch);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver(c);
		
		
		scrolling(d);

	}

	public static void scrolling(WebDriver d) {
		d.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,500)");

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement> values = d.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));   //searching two xpath at a time
		int s = 0;
		for (int i = 0; i < values.size(); i++) {
			s = s + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(s);
		int t = Integer.parseInt(d.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(s, t);
	}

}
