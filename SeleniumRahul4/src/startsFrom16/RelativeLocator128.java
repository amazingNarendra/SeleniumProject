package startsFrom16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator128 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox=d.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		d.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
	}

}