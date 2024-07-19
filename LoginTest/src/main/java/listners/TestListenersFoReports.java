package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListenersFoReports implements ITestListener{

	ExtentSparkReporter epr=new ExtentSparkReporter("C:\\Users\\margo\\java\\AutomationProject\\LoginTest\\src\\test\\java\\reports\\testreport.html");

	ExtentReports ext=new ExtentReports();
	ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		epr.config().setDocumentTitle("HRMTestReport");	
		epr.config().setReportName("LogoFeature");
		ext.attachReporter(epr);
		
		ext.setSystemInfo("Tester", "Anand");
		ext.setSystemInfo("Build_version", "4.3.0");
	
		
		 test = ext.createTest("LogoFeature Test");
		test.log(Status.INFO, "Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		test.log(Status.PASS, "Test Case Passed:" +testname);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		test.log(Status.FAIL, "Test Case Failed:" +testname);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		test.log(Status.SKIP, "Test Case Skipped:" +testname);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
	
	

	@Override
	public void onStart(ITestContext context) {
		ext.attachReporter(epr);
	}

	@Override
	public void onFinish(ITestContext context) {
	
		ext.flush();
		test.log(Status.INFO,"Test Ended");
		
	}

}
