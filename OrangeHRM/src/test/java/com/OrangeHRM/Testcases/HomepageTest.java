package com.OrangeHRM.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Com.OrangeHRM.PageObjects.homepage;
import com.Com.OrangeHRM.Utilities.Log;
import com.Com.OrangeHRM.base.BaseClass;

public class HomepageTest extends BaseClass {
	homepage HP= new homepage();
	LoginpageTest LT= new LoginpageTest();
	
	@Parameters("browser")
	@BeforeMethod
	void Setup(String browsername) {
		launchApp(browsername);
		Log.info("browserlanched");
		
		
	}

	@Test
	public void verifyhomepage() throws InterruptedException  {
		try {
			LT.verifLoginpage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.info("Login Sucessfull");
		getDriver().switchTo().frame("change your password ");
		getDriver().findElement(By.linkText("ok")).click();
		
		HP.SelectAdmin();
	Log.info("Admin selected");
		HP.add();
		Log.info("clicked on the add button");
	}
	
	@AfterMethod
	void Teardown() {
		getDriver().quit();
	}
	
}
