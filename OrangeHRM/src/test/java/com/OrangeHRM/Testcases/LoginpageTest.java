package com.OrangeHRM.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Com.OrangeHRM.PageObjects.LoginPage;
import com.Com.OrangeHRM.PageObjects.homepage;
import com.Com.OrangeHRM.Utilities.Log;
import com.Com.OrangeHRM.base.BaseClass;




public class LoginpageTest extends BaseClass {
	@Parameters("browser")
	@BeforeMethod
	void Setup(String browsername) {
		launchApp(browsername);
		Log.info("browserlanched");
		
		
	}
	@Test
	void verifLoginpage() throws InterruptedException {
		LoginPage LP=new LoginPage();
		homepage Hp= new homepage();
	LP.Setusername();
	Log.info("username entered");
	LP.setpassword();
	Log.info("Password Entered");
	LP.submit();
	Log.info("Credentails Submitted");
	Thread.sleep(2000);
	
	LP.isAlertPresent();
	Log.info("Alert not presented");
	Thread.sleep(2000);
	
	Hp.SelectAdmin();
	Log.info("Clicked on admin");
	Thread.sleep(2000);
	
	Hp.add();
	Log.info("clicked on add");
	
		
	}
	
	@AfterMethod
	void Teardown() {
		getDriver().quit();
	}

}
