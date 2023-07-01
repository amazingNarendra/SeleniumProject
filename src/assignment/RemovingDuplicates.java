package assignment;

  
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Creating RemoveDuplicatesExample1 class  
class RemovingDuplicates {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	      //URL launch
	      driver.get("https://courses.letskodeit.com/practice");
	      System.out.println(driver.getPageSource());
	      System.out.println("______________________________");
	      
//	      System.out.println(driver.findElement(By.tagName("body")));
	      List<WebElement> courseName = driver.findElements(By.xpath("//td[@class='course-name']"));
	      // identify element and click
	     
	      
//	      for(WebElement name:courseName ) {
//	    	  if(name.getText().equalsIgnoreCase("Python Programming Language"))
//	    	  {
//	    		  System.out.println(name.findElement(By.xpath("following-sibling::td[@class='price']")).getText());
//	    	  }
//	      }
	      
	      System.out.println("finished");

		
		}
}
