import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Sec4And5SelfIntroAndLocator {
	static WebDriver d=null;

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		d = new ChromeDriver();
//		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\geckodriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
//		d = new FirefoxDriver();
//		FirefoxOptions options= new FirefoxOptions();
//		options.setLegacy(true);
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\edgedriver_win64\\msedgedriver.exe");
//		d = new EdgeDriver();
		locator();
//	
	}
	
	 public static void locator() throws InterruptedException 
	{						
		String name="naru";
	   d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String p=passwordGet(); //password getting
	   d.get("https://rahulshettyacademy.com/locatorspractice/");
//	   d.findElement(By.id("inputUsername")).sendKeys("Narendra");
//	   d.findElement(By.name("inputPassword")).sendKeys("1234");
//	   d.findElement(By.className("signInBtn")).click();
//	   System.out.println(d.findElement(By.cssSelector("p.error")).getText());
//	   
	   //reset password
	   d.findElement(By.linkText("Forgot your password?")).click();
	   d.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("nare");
	   d.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nare@narendra.com");
	   d.findElement(By.xpath("//form/input[3]")).sendKeys("800080009000");
	   d.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   System.out.println(d.findElement(By.cssSelector("form p")).getText());
	   System.out.println(d.findElement(By.cssSelector("form p")).getSize());
	   
	   //goto login
	   d.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	   d.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
	 
	   d.findElement(By.cssSelector("input[type*=pass]")).sendKeys(p);
	   d.findElement(By.id("chkboxOne")).click();
	   d.findElement(By.className("submit")).click();
	   Thread.sleep(5000);
	   System.out.println(d.findElement(By.tagName("p")).getText());
	   Assert.assertEquals(d.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	   Assert.assertEquals(d.findElement(By.cssSelector("div h2")).getText(), "Hello "+name+",");
	   d.findElement(By.xpath("//button[text()='Log Out']"));
	   System.out.println("BYE");
	   
	  
	   d.close();
	}
	
	public static String passwordGet() throws InterruptedException {
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		d.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pwd=d.findElement(By.cssSelector(".infoMsg")).getText();
		String[] pwd1=pwd.split("'");
		String realPwd=pwd1[1].split("'")[0];
		System.out.println(realPwd);
		return realPwd;
	}

}
