package stratsFrom34Collections;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S346AutoItDownload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
       
	   ChromeOptions o=new ChromeOptions();
	   
	   HashMap<String,Object> map=new HashMap<String, Object>();
       map.put("profile.default_content_settings.popups",0);
       String path = System.getProperty("user.dir");
       map.put("download.default_directory",path);
	   o.setExperimentalOption("prefs", map);
		
	   WebDriver d = new ChromeDriver(o);
        d.get("https://omayo.blogspot.com/p/page7.html");
        d.findElement(By.xpath("//*[text()='ZIP file']")).click();
        Thread.sleep(5000);
        

	}
}
