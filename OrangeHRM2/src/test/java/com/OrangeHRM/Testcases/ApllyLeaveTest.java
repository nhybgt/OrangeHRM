package com.OrangeHRM.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Com.OrangeHRM.PageObjects.DasboradApplyLeave;
import com.Com.OrangeHRM.Utilities.Log;
import com.Com.OrangeHRM.base.BaseClass;

public class ApllyLeaveTest extends BaseClass {
	
	LoginpageTest Lp=new LoginpageTest();
	DasboradApplyLeave DAP= new DasboradApplyLeave();
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browsername ) {
		launchApp(browsername);
		Log.info("browserlanched");
		
	}
	@AfterMethod
	public void Teardown() {
		getDriver().quit();
		
	}
	
	@Test
	public void verifyApplyleave() throws InterruptedException {
		
			Lp.verifLoginpage();
		
		DAP.dashbodleave();
	}

}
