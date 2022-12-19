import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		d.findElement(By.cssSelector("a[href='javascript: void(0);loadAjax();']")).click();
		
		WebDriverWait wait=new WebDriverWait(d,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		
		System.out.println(d.findElement(By.xpath("//div[@id='results']")).getText());
		

	}

}
