package startsfromsec27ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePageFactory {

	WebDriver d;

	public RediffHomePageFactory(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	/*
	 * By search = By.id("srchword");
	 *  By submit =By.className("newsrchbtn");
	 */
	@FindBy(id="srchword")
	WebElement search;
	@FindBy(className = "newsrchbtn")
	WebElement submit;
	public WebElement Search() {
		return search;
	}
	public WebElement Submit() {
		return submit;
	}


}
