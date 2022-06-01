package TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testnglistener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case start details are "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success details are: "+result.getName());		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed details are: "+ result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped details are: "+ result.getName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case failed within success percentage "+ result.getName());		
	}

	public void onStart(ITestContext context) {
		System.out.println(" Test case onstart details are "+ context.getName());		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test case onfinish details are "+ context.getName());		
	}

}
