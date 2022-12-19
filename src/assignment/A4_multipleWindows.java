package assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/windows");
		d.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> w=d.getWindowHandles();
		Iterator<String> it=w.iterator();
		String p=it.next();
		String c=it.next();
		
		d.switchTo().window(c);
		System.out.println(d.findElement(By.xpath("//div[@class='example']/h3")).getText());
		d.switchTo().window(p);
		System.out.println(d.findElement(By.xpath("//div[@class='example']//h3")).getText());
		
		

		
	}

}
