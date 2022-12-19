import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sec58CheckBoxAssignmet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("checkBoxOption1")).click();
		System.out.println(d.findElement(By.id("checkBoxOption1")).isSelected());
		d.findElement(By.id("checkBoxOption1")).click();
		System.out.println(d.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(d.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
