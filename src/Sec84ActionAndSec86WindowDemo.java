import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sec84ActionAndSec86WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		
		
		windows(d);
		actions(d);
		d.quit();
		
	}
	public static void windows(WebDriver d) throws InterruptedException {
		d.get("https://rahulshettyacademy.com/loginpagePractise/#");
		d.findElement(By.cssSelector("a[target='_blank']")).click();
		Set<String> window=d.getWindowHandles();
		Iterator<String> it =window.iterator();
		String p=it.next();
		String c=it.next();
		d.switchTo().window(c);
		Thread.sleep(2000);
		String s=d.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(s);
		d.switchTo().window(p);
		d.findElement(By.cssSelector("#username")).sendKeys("hi");
		
	}
	
	public static void actions(WebDriver d) {
		d.get("https://www.amazon.in/");
		Actions a=new Actions(d);
		WebElement move=d.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));

		a.moveToElement(d.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HEllo").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();

	}

}
