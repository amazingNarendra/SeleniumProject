import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sec69to71AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebDriverWait w= new WebDriverWait(d, 5);
		
		d.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsN= {"Cucumber","Brocolli","Beetroot","Cauliflower"};
		addItems( d,itemsN);
		
		d.findElement(By.cssSelector("img[alt='Cart']")).click();
		d.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		d.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");		
		d.findElement(By.cssSelector(".promoBtn")).click();	
		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(d.findElement(By.cssSelector(".promoInfo")).getText());
		
		System.out.println("end");
	}
	
	public static void addItems(WebDriver d,String[] itemsN)
	{
List<WebElement> p=d.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		
		for(int i=0;i<p.size();i++)
		{				
			String[] name=p.get(i).getText().split("-"); //spliting the name
			String fName=name[0].trim();                 // removing white space
			
			List itemsNList=Arrays.asList(itemsN);       //changing to arraylist
			
			if(itemsNList.contains(fName))
			{
				j++;
				d.findElements(By.xpath("(//div[@class='product-action'])/button")).get(i).click();
				if(j>itemsN.length)
					break;
			}
				
		}
	}

}
