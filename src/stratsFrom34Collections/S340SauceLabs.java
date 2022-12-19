package stratsFrom34Collections;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class S340SauceLabs {
	
	public static final String USERNAME="oauth-narendrareddy9642-8f1d1";
	public static final String ACCESS="36aa0216-f1bb-4081-805a-9f26cdb03e7d";
	public static final String URL ="http://"+USERNAME+":"+ACCESS+"@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability("platform", "Windows 7");
		dc.setCapability("version", "51.0");
		
		WebDriver d=new RemoteWebDriver(new URL(URL),dc);
		
		d.get("https://www.google.co.in/");
		System.out.println(d.getTitle());
	

	}

}
