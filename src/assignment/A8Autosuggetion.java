package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A8Autosuggetion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//li[@class='ui-menu-item']/div[text()='India']")));
//		d.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		d.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		System.out.println(d.findElement(By.id("autocomplete")).getAttribute("value"));

	}

}
