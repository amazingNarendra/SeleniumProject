package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7WebTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement md=d.findElement(By.xpath("//div[@class='left-align']//table[@id='product']"));
		int r=md.findElements(By.xpath("//table[@name='courses']//tr")).size();
		int c=md.findElements(By.xpath("//table[@name='courses']//th")).size();
		System.out.println("The number of rows : "+r);
		System.out.println("The number of colums : "+c);
		
		System.out.println("the values present in 2nd row");
		
		List<WebElement> links=md.findElements(By.xpath("//table[@name='courses']//tr[3]//td"));
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}

	}
}
