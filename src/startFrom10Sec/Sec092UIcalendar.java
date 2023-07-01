package startFrom10Sec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sec092UIcalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);
		d.findElement(By.id("form-field-travel_comp_date")).click();
		
//		d.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).click();
//		while(!d.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("2023")) {
//			d.findElement(By.cssSelector("[class='datepicker-months'] [class='next']")).click();
//		}
		
		while(!d.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("April")) {
			d.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		
		List<WebElement> dates=d.findElements(By.cssSelector(".day"));
		int c=d.findElements(By.cssSelector(".day")).size();
		
		for(int i=0;i<c;i++) {
			String text=dates.get(i).getText();
			if(text.equalsIgnoreCase("12"))
			{
				dates.get(i).click();
				break;
			}
		}
		

	}

}
