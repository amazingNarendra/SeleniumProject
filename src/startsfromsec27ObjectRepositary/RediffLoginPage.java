package startsfromsec27ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver d;

	public RediffLoginPage(WebDriver d) {
		this.d = d;
	}

	By username = By.id("login1");
	By pwd = By.name("passwd");
	By signIn = By.name("proceed");
	By home =By.className("f12");
	public WebElement EmailId() {
		return d.findElement(username);
	}
	public WebElement Pwd() {
		return d.findElement(pwd);
	}
	public WebElement SigninButton() {
		return d.findElement(signIn);
	} 
	public WebElement Home() {
		return d.findElement(home);
	} 

}
