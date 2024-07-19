package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListenersFoReports2 implements ITestNGListener{

	ExtentSparkReporter epr=new ExtentSparkReporter("C:\\Users\\margo\\java\\AutomationProject\\LoginTest\\src\\test\\java\\reports\\testreport.xml");

	ExtentReports ext=new ExtentReports();
	ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
		epr.config().setDocumentTitle("HRMTestReport");	
		epr.config().setReportName("LogoFeature");
		ext.attachReporter(epr);
		
		ext.setSystemInfo("Tester", "Anand");
		ext.setSystemInfo("Build_version", "4.3.0");
		
		test.log(Status.INFO, "Test Started");
	}


	public void onTestSuccess(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		test.log(Status.PASS, "Test Case Passed:" +testname);
	}


	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		test.log(Status.FAIL, "Test Case Failed:" +testname);
	}


	public void onTestSkipped(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		test.log(Status.SKIP, "Test Case Skipped:" +testname);
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}


	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
	
	

	
	public void onStart(ITestContext context) {
		
	}


	public void onFinish(ITestContext context) {
	
	}

}
