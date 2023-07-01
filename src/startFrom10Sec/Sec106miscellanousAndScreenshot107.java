package startFrom10Sec;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sec106miscellanousAndScreenshot107{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		scnshoot(d);

	}

	public static void scnshoot(WebDriver d) throws IOException {
		d.get("https://www.google.com/");

		TakesScreenshot scrShot = ((TakesScreenshot) d);
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		File dis=new File("scr.png");
		FileUtils.copyFile(src, new File("C:\\narendra\\scr.png"));
		
		FileHandler.copy(src, dis);
		d.close();
	}

}
