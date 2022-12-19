package startsFrom16Sec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator128 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox=d.findElement(By.name("name"));
		//d.findElement(withTagName("label").above(nameEditBox)).getText();
		System.out.println(nameEditBox.getRect().getDimension().getHeight());
	}

}