package startsfromsec27ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver d;

	public RediffHomePage(WebDriver d) {
		this.d = d;
	}

	By search = By.id("srchword");
	By submit =By.className("newsrchbtn");
	public WebElement Search() {
		return d.findElement(search);
	}
	public WebElement Submit() {
		return d.findElement(submit);
	}


}
