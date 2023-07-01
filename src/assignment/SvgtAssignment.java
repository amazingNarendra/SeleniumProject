package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SvgtAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://emicalculator.net/");
		String tooltip="//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		List<WebElement> list = d.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"));
		
		
		System.out.println(list.size());
		
		Actions a= new Actions(d);
		for(WebElement e:list) {
			a.moveToElement(e).perform();
			System.out.println(d.findElement(By.xpath(tooltip)).getText());
			
		}
		

	}

}
