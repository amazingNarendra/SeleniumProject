package stratsFrom34Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S342WindowAuth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().window().maximize();
		d.get("http://admin:admin@the-internet.herokuapp.com/"); // http://username:password@siteUrl
		d.findElement(By.linkText("Basic Auth")).click();
		System.out.println(d.findElement(By.cssSelector("div[class='example'] p")).getText().split("!")[0]);
		
		Thread.sleep(5000);
		d.close();

	}

}
