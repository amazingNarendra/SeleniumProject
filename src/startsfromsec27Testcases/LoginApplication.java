package startsfromsec27Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import startsfromsec27ObjectRepositary.RediffHomePage;
import startsfromsec27ObjectRepositary.RediffHomePageFactory;
import startsfromsec27ObjectRepositary.RediffLoginPage;

public class LoginApplication {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd= new RediffLoginPage(d);
		rd.EmailId().sendKeys("hello");
		rd.Pwd().sendKeys("1234");
		//rd.SigninButton().click();
		rd.Home().click();
		Thread.sleep(10000);
		
		//page object model
		/*
		 * RediffHomePage rh=new RediffHomePage(d);
		 *  rh.Search().sendKeys("rediff");
		 * rh.Submit().click(); System.out.println("success");
		 */
		
		//page factory
		RediffHomePageFactory rh=new RediffHomePageFactory(d);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		System.out.println("success");
	}

}
