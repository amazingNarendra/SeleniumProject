package stratsFrom34Collections;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S346AutoItUdemyFileupload {
	public static class UploadFileRobot {
String URL = "https://convertio.co/txt-jpg/";

@Test
public void uploadFile() throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
    Thread.sleep(2000);
    
//    direct sendkeys method
//    driver.findElement(By.xpath("//input[@type='file'] [1]")).sendKeys("C:\\Users\\nagae\\Documents\\fileupload.au3");
//   
    driver.findElement(By.xpath("//input[@type='file'] [1]")).click();
    Runtime.getRuntime().exec("C:\\Users\\nagae\\Documents\\fileupload.au3");
    
  /*
    Robot robot = new Robot();
    robot.delay(2000);
    StringSelection stringSelection = new StringSelection("C:\\Users\\nagae\\Documents\\fileupload.au3");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    
   
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

    Thread.sleep(2000);
    */
}













//@Test
public void testUpload() throws InterruptedException, AWTException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get(URL);
    WebElement element = driver.findElement(By.cssSelector("[class='action-label']"));
   element.click();
//   setClipboardData("C:\\Users\\nagae\\Documents\\fileupload.exe");
   StringSelection stringSelection = new StringSelection("C:\\Users\\nagae\\Documents\\fileupload.au3");
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
   

   Robot robot = new Robot();
   
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);

   Thread.sleep(2000);

}

/**

     * This method will set any parameter string to the system's clipboard.

     */

public static void setClipboardData(String string) {

//StringSelection is a class that can be used for copy and paste operations.

   StringSelection stringSelection = new StringSelection(string);

   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

}

public static void uploadFile(String fileLocation) {

        try {

        //Setting clipboard with file location

            setClipboardData(fileLocation);

            //native key strokes for CTRL, V and ENTER keys

            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_ENTER);

            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception exp) {

        exp.printStackTrace();

        }

    }

}

}
