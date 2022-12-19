package stratsFrom34Collections;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S346AutoItUdemy {public static class UploadFileRobot {
String URL = "https://convertio.co/txt-jpg/";
@Test
public void testUpload() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nagae\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\chomeDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
driver.get(URL);
WebElement element = driver.findElement(By.cssSelector("[class='action-label']"));
element.click();

uploadFile("C:\\Users\\nagae\\Documents\\fileupload.exe");

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
