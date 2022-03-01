package startsFrom16;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NewWindow131 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		d.switchTo().newWindow(WindowType.TAB);//getting error
		
		Set<String>h=d.getWindowHandles();
		Iterator<String>it=h.iterator();
		String parent=it.next();
		String child=it.next();
		d.switchTo().window(child);
		d.get("https://rahulshettyacademy.com/#/index");
		String courseName=d.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		d.switchTo().window(parent);
		
		//scrnshot
		WebElement name=d.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		File file=name.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("logo.png"));
		//dimensions
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		

	}

}
