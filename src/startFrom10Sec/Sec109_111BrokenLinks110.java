package startFrom10Sec;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Sec109_111BrokenLinks110 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=d.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		for(WebElement l:links)
		{
			String url=l.getAttribute("href");  // it is link only
			
			HttpURLConnection cn = (HttpURLConnection)new URL(url).openConnection();
			cn.setRequestMethod("HEAD");
			cn.connect();
			int rc=cn.getResponseCode();
			System.out.println(rc);
			a.assertTrue(rc<400, "the broken link is ::"+url+ "with code "+rc); //soft assertion
			 
//			if(rc>400) {                    //hardassertion
//				System.out.println("broken link is "+l.getText()+" code is " +rc);
//				Assert.assertTrue(false);
//			
//			}
//			
			
			
		}
		a.assertAll();
		
		
		

	}

}
