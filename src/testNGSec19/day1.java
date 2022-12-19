package testNGSec19;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void Demo()
	{
		System.out.println("hi");
		//Assert.assertTrue(false);  //listeners
	}
	@BeforeMethod
	public void bm() {
		System.out.println("before method in day1");
	}
	@Test(groups= {"Smoke"})
	public void Demo1()
	{
		System.out.println("hello");
	}
	
	@Test(enabled=false)
	public void Demo2()
	{
		System.out.println("Bye");
	}
	
	

}
