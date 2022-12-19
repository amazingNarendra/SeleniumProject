package startFrom10Sec;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sec115WebTableSortingStream115{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		d.findElement(By.xpath("(//th[@role='columnheader']/span)[1]")).click();     //veg/fruit name
		List<WebElement>r=d.findElements(By.xpath("//tr/td[1]"));                //reading all fruit names
		List<String>ol=r.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sl=ol.stream().sorted().collect(Collectors.toList());        //sorting fruit names
		Assert.assertTrue(ol.equals(sl));
		List<String> p;
		//price of beans
		do 
		{
			List<WebElement>r1=d.findElements(By.xpath("//tr/td[1]"));// to add elements again
		p=r1.stream().filter(s->s.getText().contains("Rice"))   // if only p contains rice then it not goto next page
				.map(s->getPrice(s)).collect(Collectors.toList());
		p.forEach(a->System.out.println(a));
		if(p.size()<1) {
			d.findElement(By.cssSelector("a[aria-label='Next']")).click();    //pagationation
		}
		}while(p.size()<1);
	

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
