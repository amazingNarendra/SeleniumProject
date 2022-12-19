package stratsFrom34Collections;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S346AutoItUploadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://convertio.co/txt-jpg/");
        d.findElement(By.cssSelector("[class='action-label']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\nagae\\Documents\\fileupload.exe");

	}

}
