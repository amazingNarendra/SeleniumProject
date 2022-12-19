package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class A6CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("checkBoxOption3")).click();
		String value=d.findElement(By.xpath("//label[@for='honda']")).getText();
		Select s=new Select(d.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(value);
		d.findElement(By.name("enter-name")).sendKeys(value);
		d.findElement(By.id("alertbtn")).click();
		String finalValue=d.switchTo().alert().getText().split(",")[0].split(" ")[1].trim();
		Assert.assertEquals(value, finalValue);
		System.out.println("Success");

	}

}
