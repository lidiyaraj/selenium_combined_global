package generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public abstract  class ListenerImplementation  implements ITestListener,IAutoConstants {
	public static ExtentTest Logger;
	public ExtentReports report;
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./report/execution.html");
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setTheme(Theme.STANDARD);
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform","windows");
		report.setSystemInfo("author","Lidiya");				
	}
	public void onTestFailure(ITestResult result) {
		Logger.log(Status.FAIL,"This test case"+result.getName()+"is failed");	
		
	//Logger.addScreenCaptureFromPath("C:\\Users\\Lidiya\\eclipse-workspace\\Seleniumframework\\errorshots\\api 2023-08-04T12-25-37.359.png");		
	ScreenshotUtility utility = new ScreenshotUtility();
	Logger.addScreenCaptureFromPath(utility.takingScreennshot(result.getName()));	
	}
	public void onTestStart(ITestResult result) {
		Logger = report.createTest(result.getName());					
	}
	public void onTestSuccess(ITestResult result) {
		Logger.log(Status.PASS,"This test case"+result.getName()+"is success");		
	}
	public void onFinish(ITestContext context) {
		report.flush();				
	}
}
