import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreportssample 
{
  ExtentReports extent;
  ExtentTest test;
  
  @BeforeTest
  public void startreport()
  {
	  extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/extentrepsample.html",true);
	  extent.addSystemInfo("HostName", "Anusha")
	  .addSystemInfo("Environment","QA")
	  .addSystemInfo("User Name", "Anusha Gutta");
	  extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	  
  }
	@Test
	public void demoreportpass()
	{
		test=extent.startTest("demoreportpass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condition is true");
		System.out.println("Passed");
				
	}
	@Test
	public void demoreportfail()
	{
		test=extent.startTest("demoreportfail");
		System.out.println("Intentional fail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert pass as condition is false");				
	}
	
	@AfterMethod
	public void getresult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
	}
	@AfterTest
	public void endreport()
	{
		extent.flush();
		extent.close();
	}
}
