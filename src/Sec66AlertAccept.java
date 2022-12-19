import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sec66AlertAccept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		// alert
		int a=5;
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("name")).sendKeys("Rahul");
		d.findElement(By.id("alertbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
	}

}
