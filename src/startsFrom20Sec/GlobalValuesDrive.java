package startsFrom20Sec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
	public static void main(String[] args) throws Exception {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\nagae\\eclipse-workspace\\OnlineJavaVideos\\src\\startsFrom20Sec\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "chrome");
		prop.setProperty("browse", "ie");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\nagae\\eclipse-workspace\\OnlineJavaVideos\\src\\startsFrom20Sec\\data.properties");
		prop.store(fos, null);
	}

}
