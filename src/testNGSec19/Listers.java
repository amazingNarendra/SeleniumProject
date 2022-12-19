package testNGSec19;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listers implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		//System.out.println("******started"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		//System.out.println("******success"+result.getName());
		System.out.println("inside success");
	}
	
	public void onTestFailure(ITestResult result) {
		//System.out.println("******failed"+result.getName());
		System.out.println("inside Failure");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("******skipped"+result.getName());
	}
	
	public void onTestFinish(ITestResult context) {
		System.out.println("******finished"+context.getName());
	}


}
