package startsfromsec27ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {

	WebDriver d;

	public RediffLoginPageFactory(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	/*
	 * By username = By.id("login1"); By pwd = By.name("passwd"); By signIn =
	 * By.name("proceed"); By home =By.className("f12");
	 */
	@FindBy(id="login1")
	WebElement username;
	@FindBy(name = "passwd")
	WebElement pwd;
	@FindBy(name = "proceed")
	WebElement signIn;
	@FindBy(className = "f12")
	WebElement home;
	
	
	public WebElement EmailId() {
		return username;
	}
	public WebElement Pwd() {
		return pwd;
	}
	public WebElement SigninButton() {
		return signIn;
	} 
	public WebElement Home() {
		return home;
	} 

}
