package testNGSec19;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void Web()
	{
		System.out.println("web");
	}
	@Test(dependsOnMethods = {"Web"})
	public void API()
	{
		System.out.println("API");
	}
	@Parameters({"URL"})
	@Test()
	public void Mobile(String urlname)
	{
		System.out.println("Mobile");
		System.out.println(urlname);
	}
	
	@BeforeTest
	public void first()
	{
		System.out.println("First");
	}

}
