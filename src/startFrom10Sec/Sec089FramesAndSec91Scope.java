package startFrom10Sec;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sec089FramesAndSec91Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		scope(d);

//		frames(d);
	}

	public static void scope(WebDriver d) {
		d.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement md = d.findElement(By.id("gf-BIG"));
		System.out.println(md.findElements(By.tagName("a")).size());

		WebElement mmd = d.findElement(By.xpath("//tbody/tr/td/ul[1]"));
		System.out.println(mmd.findElements(By.tagName("a")).size());

		for (int i = 1; i < mmd.findElements(By.tagName("a")).size(); i++) {
			String clickOnThat = Keys.chord(Keys.CONTROL, Keys.ENTER);
			mmd.findElements(By.tagName("a")).get(i).sendKeys(clickOnThat);
			// Thread.sleep(5000L);
		}
		Set<String> s = d.getWindowHandles();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			d.switchTo().window(it.next());
			System.out.println(d.getTitle());
		}

	}

	public static void frames(WebDriver d) throws InterruptedException {
		d.get("https://jqueryui.com/droppable/");
		System.out.println(d.findElements(By.tagName("iframe")).size());
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		//d.findElement(By.className("demo-frame"))
		WebElement s = d.findElement(By.id("draggable"));
		WebElement t = d.findElement(By.id("droppable"));
		Actions a = new Actions(d);
		a.dragAndDrop(s, t).build().perform();
		d.switchTo().defaultContent();
		
		Thread.sleep(5000);
		d.close();

	}

}
