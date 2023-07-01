package startFrom10Sec;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sec124SeleniumGrid {
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver d1= new RemoteWebDriver(new URL("http://192.168.1.25:4444/wd/hub"),dc);
		d1.get("https://www.google.com");
		System.out.println(d1.getTitle());
	} 		

		
}
