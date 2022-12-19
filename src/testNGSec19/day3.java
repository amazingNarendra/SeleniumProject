package testNGSec19;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@AfterTest
	public void last() {
		System.out.println("last executed");
	}
	@Test(dataProvider="getData")
	public void Demo(String Username,String pwd)
	{
		System.out.println(" d3 hi");
		System.out.println(Username +":::: "+pwd);
	}
	@Parameters({"URL","APIKey/username"})
	@Test(groups = {"Smoke"})
	public void Demo1(String urlname,String key)
	{
		System.out.println("d3 hello");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(groups= {"Smoke"})
	public void Demo2()
	{
		System.out.println("d3 Bye");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object d[][]=new Object[3][2];
		d[0][0]="1username";
		d[0][1]="2username";
		
		d[1][0]="1username";
		d[1][1]="2username";
		
		d[2][0]="1username";
		d[2][1]="2username";
		return d;
	}
	

}
