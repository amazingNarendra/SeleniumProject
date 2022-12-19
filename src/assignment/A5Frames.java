package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class A5Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(d.findElements(By.tagName("frameset")).size());
		d.switchTo().frame(0);
		
		d.switchTo().frame(1);
		System.out.println(d.findElement(By.id("content")).getText());

		
	}

}
