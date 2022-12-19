package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A66_Cleartrip {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.cleartrip.com/");
		
		
//		d.findElement(By.cssSelector("div[class*='homeCalender']")).click();
//		d.findElement(By.cssSelector("div[aria-label*='Jan 05 2022'] div[class*='flex-center flex-top']")).click();
		
		Select s=new Select(d.findElement(By.cssSelector("div[class='mb-4'] select[class='bc-neutral-100 bg-transparent']")));
		s.selectByIndex(2);
		Select s1=new Select(d.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]")));
		s1.selectByIndex(2);
		
		d.findElement(By.cssSelector("a[class='td-none hover:td-underline px-4 mt-1 weak']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indigo");
		d.findElement(By.cssSelector("button[class*='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")).click();
		System.out.println(d.findElement(By.cssSelector(".to-ellipsis.o-hidden.ws-nowrap.fs-3.c-white")).getText());
	}


}
