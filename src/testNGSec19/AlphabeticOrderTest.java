package testNGSec19;

import org.testng.annotations.Test;

public class AlphabeticOrderTest {

	@Test
	public void test1() {
		System.out.println("lower case alphabets");
	}
	@Test
	public void Test1()   //will run at first
	{  
		System.out.println("Upper case alphabets");
	}
}
